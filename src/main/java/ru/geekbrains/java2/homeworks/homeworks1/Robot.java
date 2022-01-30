package ru.geekbrains.java2.homeworks.homeworks1;

public class Robot implements Participant {
    private String name;
    private int maxLength;
    private int maxHeight;


    @Override
    public boolean jump(int height) {
//        System.out.println("Robot jumped");
        return this.maxHeight >= height;
    }
    @Override
    public boolean run(int length){
//        System.out.println("Robot ran");
        return this.maxLength >= length;
    }

    public Robot(String name, int maxHeight, int maxLength){
        this.name = name;
        this.maxHeight =maxHeight;
        this.maxLength =maxLength;
    }
    public String getName() {
        return name;
    }

}
