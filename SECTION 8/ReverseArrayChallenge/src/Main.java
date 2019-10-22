/*
    -Write a method called reverse() with an int array as a parameter.
    -The method should not return any value. In other words, the method is allowed to modify the array parameter.
    -In main() test the reverse() method and print the array both reversed and non-reversed.
    -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element
    and so on.
    -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(array));
        reverse(array);
    }
    private static void reverse(int[] array){
        int[] reversed = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reversed[i] = array[array.length - i - 1];
        }
        array = reversed;
        System.out.println(Arrays.toString(array));
    }
}
