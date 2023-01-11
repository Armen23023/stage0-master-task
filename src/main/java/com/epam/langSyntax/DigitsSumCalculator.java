package com.epam.langSyntax;

public class DigitsSumCalculator {

     public void calculateSum(int number) {
        int  r = 0;
        while(number!=0){
            r = r + number%10;
            number =  number/10;
        }
        System.out.println(r);
    }

}
