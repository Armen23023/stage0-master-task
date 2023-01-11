package com.epam.conditions;

public class DaysInMonth {

     public void printDays(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year,month);
        int daysInMonth = yearMonth.lengthOfMonth();
        if (daysInMonth>0){
            System.out.println(daysInMonth);
        }else {
            System.out.println("invalid date");
        }
    }

}
