package com.epam.conditions;

public class SeasonDeterminer {

     public void tellTheSeason(int monthNumber) {
        switch (monthNumber) {
            case 1, 2, 3 -> System.out.println("Winter");
            case 4, 5, 6 -> System.out.println("Spring");
            case 7, 8, 9 -> System.out.println("Summer");
            case 10, 11, 12 -> System.out.println("Autumn");
            default -> System.out.println("Wrong month number");
        }
    }

}
