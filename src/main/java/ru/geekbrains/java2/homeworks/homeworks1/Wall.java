package ru.geekbrains.java2.homeworks.homeworks1;

public class Wall implements Obstacles{
    private int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public boolean passingObstacles(Participant participant){
        if (participant.jump(this.height)){
            System.out.printf(" %s jumped over wall\n", participant.getName() );
            return true;
        } else{
            System.out.printf(" %s haven't jumped over wall\n", participant.getName() );
            return false;
        }
    }




}
