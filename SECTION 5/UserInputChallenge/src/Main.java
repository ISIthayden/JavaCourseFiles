import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(count < 10){
            int order = count + 1;
            System.out.println("Enter number #" + order + ": ");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
            }
            else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println(sum);
        scanner.close();
    }
}
