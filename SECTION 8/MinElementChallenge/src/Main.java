/*
    -Write a method called readIntegers() with a parameter called count that represents how many integers the user
    needs to enter.
    -The method needs to read from the console until all the numbers are entered, and then return an array containing
    the numbers entered.
    -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
    -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
    -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
    -Finally, print the minimum element in the array.
*/

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] array = readIntegers(count);
        System.out.println("Min value in array: " + findMin(array));
    }

    private static int[] readIntegers(int count){
        int[] array = new int[count];

        for(int i = 0; i < array.length; i++){
            System.out.println("Enter number " + (i + 1));
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }
    private static int findMin(int[] array){
        int min = array[array.length - 1];

        for(int i = 0; i < array.length - 1; i++){
            int value = array[i];

            if(value < min){
                min = value;
            }
        }
        return min;
    }
}
