// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] intArray = getIntegers(5);
        printIntegers(intArray);
        System.out.println("The descending order is");
        printIntegers(sortIntegers(intArray));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static int[] sortIntegers(int[] array){
        int[] descending = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            descending[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < descending.length - 1; i++) {
                if (descending[i] < descending[i + 1]) {
                    temp = descending[i];
                    descending[i] = descending[i + 1];
                    descending[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return descending;
    }
    public static void printIntegers(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + ", typed value was " + array[i]);
        }
    }
}
