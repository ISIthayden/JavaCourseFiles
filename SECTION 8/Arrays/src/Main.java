import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] intArray = getIntegers(5);
        for(int i = 0; i < intArray.length; i++){
            System.out.println("Element " + i + ", typed value was " + intArray[i]);
        }
        System.out.println("The average is " + getAverage(intArray));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }
}
