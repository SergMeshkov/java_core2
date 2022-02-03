package ru.geekbrains.java2.homeworks.homeworks6;

import java.io.*;
import java.net.Socket;
import java.net.SocketException;

public class Handler {
    private static final int PORT = 8189;
    private int clientNumber = 0;
    private Socket socket;
    private DataInputStream in;
    private DataOutputStream out;


    public Handler(Socket socket){
        this.socket = socket;
        this.clientNumber = ++clientNumber;

    }

    public void start() {
        try (var socket = new Socket()) {
            System.out.println("Connected to server");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            startConsoleThread();

            while (true) {
                var message = in.readUTF();
                System.out.println("Received: " + message);
            }
        } catch (SocketException e) {
            System.out.println("Connection to server has been lost");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void startConsoleThread() {
        clientThread = new Thread(() -> {
            try (var reader = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.print("Enter message for server >>>> ");
                while (!Thread.currentThread().isInterrupted()) {
                    if (reader.ready()) {
                        var clientMessage = reader.readLine();
                        if (clientMessage.equalsIgnoreCase("/quit")) {
                            out.writeUTF("/end");
                        }
                        out.writeUTF(clientMessage);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
