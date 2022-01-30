package ru.geekbrains.java2.lessons.lesson2_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsExample {
    public static void main(String[] args) /*throws Exception*/{
//        simpleExceptions();
//        scan();
//        try {
//            scanThrows();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    }

    private static void generateException(){
        RuntimeException e = new ClassCastException("jg,hf,,hfyj");
        throw e;
    }

    private static void scan() {
        try {
        Scanner scanner = new Scanner(new File("files/some.txt"));
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    } catch (FileNotFoundException e){
        e.printStackTrace();
    } finally {
        }
    }

    private static void tryWithResourcesScan() {
        try (Scanner scanner = new Scanner(new File("files/some.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private static void scanThrows() throws FileNotFoundException, ArithmeticException{
        try (Scanner scanner = new Scanner(new File("files/some.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }



    private static void simpleExceptions() {
        System.out.println("Start dividing");
        try {
            divideByZero();
//         } catch (Exception e) {

        } catch (ArithmeticException | ClassCastException | NumberFormatException e){
            System.out.println("Exception caught");
//            e.printStackTrace(); // печатает красным исключения, но приложение не упадет
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("AIOOBE");
        } catch (NullPointerException e){
            System.out.println("Npe");
//            System.exit(-1);
        } catch (Exception e){
            //.....
        } finally {
            System.out.println("FINALLY");
        }

        System.out.println("Finish dividing");
    }

    private static void divideByZero(){
        div2(10,0);
    }

    private static int div2(int a, int b){
        return div1(a,b);
    }

    private static int div1(int a, int b){
        return div0(a,b);
    }

    private static int div0(int a, int b){

        return a / b;
    }



}
