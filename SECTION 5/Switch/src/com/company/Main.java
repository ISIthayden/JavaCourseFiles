package com.company;

public class Main {

    public static void main(String[] args) {

        int switchValue = 5;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, 4, or 5");
                System.out.println("it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char letter = 'T';

        switch(letter) {
            case 'A':
                System.out.println("It's an A");
                break;
            case 'T':
                System.out.println("It's a T");
                break;
            default:
                System.out.println("Not an A or a T");
                break;
        }
    }
}
