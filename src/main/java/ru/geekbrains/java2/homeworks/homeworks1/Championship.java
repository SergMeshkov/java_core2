package ru.geekbrains.java2.homeworks.homeworks1;

public class Championship {
    public static void main(String[] args) {
        Participant[] participants = {
                new Cat("Pushok", 2000, 310),
                new Robot("i318", 20000, 0),
                new Human("Oleg", 4500, 150)
        };

        Obstacles[] obstacles = {
                new RunningTrack(900),
                new Wall(140),
                new RunningTrack(1800),
                new Wall( 50)
        };

        for (Participant participant : participants) {
            for (Obstacles obstacles1 : obstacles) {
                if (!obstacles1.passingObstacles(participant)) break;
            }
        }
    }

}
