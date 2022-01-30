package ru.geekbrains.java2.homeworks.homeworks1;

public class RunningTrack implements Obstacles{
    private int length;

    public RunningTrack(int length){
        this.length = length;
    }

    @Override
    public boolean passingObstacles(Participant participant){
        if (participant.run(this.length)){
            System.out.printf("%s successfully ran\n", participant.getName());
            return true;
        } else{
            System.out.printf("%s couldn't ran\n", participant.getName());
         return false;
        }
    }

}
