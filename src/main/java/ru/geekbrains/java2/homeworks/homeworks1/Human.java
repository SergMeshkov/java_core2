package ru.geekbrains.java2.homeworks.homeworks1;

public class Human implements Participant {
    private String name;
    private int maxLength;
    private int maxHeight;

    @Override
    public boolean jump(int height) {
//        System.out.println("Human jumped");
        return this.maxHeight >= height;
    }
    @Override
    public boolean run(int length){
//        System.out.println("Human ran");
        return this.maxLength >= length;
    }

    public Human(String name, int maxHeight, int maxLength){
        this.name = name;
        this.maxHeight =maxHeight;
        this.maxLength =maxLength;
    }
    public String getName() {
        return name;
    }
}
