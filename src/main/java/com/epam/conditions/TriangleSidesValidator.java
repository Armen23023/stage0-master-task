package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        if (firstSide + secondSide > thirdSide) {
            if (firstSide + thirdSide > secondSide) {
                if (secondSide + thirdSide > firstSide) System.out.println("this is a valid triangle");
            }
        }
        System.out.println("it's not a triangle");
    }

}
