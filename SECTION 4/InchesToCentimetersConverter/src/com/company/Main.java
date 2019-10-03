package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(3, 6));
        System.out.println(calcFeetAndInchesToCentimeters(42));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if ((feet < 0) || (inches > 12)) {
            return -1;
        }
        double centimeters = ((feet * 12) + inches) * 2.54;
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        if (inches < 0) {
            return -1;
        }
        double centimeters = calcFeetAndInchesToCentimeters(inches / 12, inches % 12);
        return centimeters;
    }
}
