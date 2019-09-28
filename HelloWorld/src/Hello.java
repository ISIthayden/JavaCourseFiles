public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int firstNumber = (5 + 10) + (2 * 10);
        int secondNumber = 12;
        int thirdNumber = firstNumber * 2;
        int total = firstNumber + secondNumber + thirdNumber;

        int lastOne = 1000 - total;

        System.out.println(total);
        System.out.println(lastOne);
    }
}
