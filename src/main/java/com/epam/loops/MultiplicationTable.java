package com.epam.loops;

public class MultiplicationTable {

      public void printTable(int numberTableToPrint) {
        if(numberTableToPrint<0) {
            System.out.println("Please input a positive integer");
            return;
        }
        System.out.println(numberTableToPrint + " * 0 = " + 0);
        System.out.println(numberTableToPrint + " * 1 = " + numberTableToPrint);
        System.out.println(numberTableToPrint + " * 2 = " + numberTableToPrint * 2);
        System.out.println(numberTableToPrint + " * 3 = " + numberTableToPrint * 3);
        System.out.println(numberTableToPrint + " * 4 = " + numberTableToPrint * 4);
        System.out.println(numberTableToPrint + " * 5 = " + numberTableToPrint * 5);
        System.out.println(numberTableToPrint + " * 6 = " + numberTableToPrint * 6);
        System.out.println(numberTableToPrint + " * 7 = " + numberTableToPrint * 7);
        System.out.println(numberTableToPrint + " * 8 = " + numberTableToPrint * 8);
        System.out.println(numberTableToPrint + " * 9 = " + numberTableToPrint * 9);
    }

}
