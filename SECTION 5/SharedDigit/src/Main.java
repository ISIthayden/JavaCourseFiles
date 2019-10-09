public class Main {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 46;
        int num3 = 34;

        System.out.println("Do " + num1 + " and " + num2 + " have any shared digits? " +
                SharedDigit.hasSharedDigit(num1, num2));

        System.out.println("Do " + num3 + " and " + num2 + " have any shared digits? " +
                SharedDigit.hasSharedDigit(num3, num2));
    }
}
