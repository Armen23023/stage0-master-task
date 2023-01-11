package com.epam.langSyntax;

public class NumberReverter {

     public void revert(int number) {
        String  r ="";
        while(number!=0){
            r = r + number%10;
            number =  number/10;
        }
        System.out.println(r);
    }

}
