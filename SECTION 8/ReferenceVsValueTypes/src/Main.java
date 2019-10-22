import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = x;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        y++;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int[] intArray = new int[5];
        int[] intArray2 = intArray;

        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("intArray2 = " + Arrays.toString(intArray2));

        intArray2[0] = 1;

        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("intArray2 = " + Arrays.toString(intArray2));

        intArray2 = new int[] {4,5,6,7,8};
        modArray(intArray);

        System.out.println("intArray = " + Arrays.toString(intArray));
        System.out.println("intArray2 = " + Arrays.toString(intArray2));
    }

    private static void modArray(int[] array){
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }
}
