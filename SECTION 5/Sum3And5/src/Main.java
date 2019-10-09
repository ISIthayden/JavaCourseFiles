/*
    create a for statement using a range of numbers from 1 to 1000 inclusive
    sum all the numbers that can be divided with both 3 and also with 5
    for those numbers that met the above conditions, print out the number
    break out of the loop once you find 5 numbers that met the above conditions
    after breaking out of the loop print the sum of the number that met the above conditions

 */

public class Main {
    public static void main(String[] args) {
        int sum =0;
        int counter = 0;
        for(int i = 1; i <= 1000; i++){
            if((i % 5 == 0) && (i % 3 == 0)){
                System.out.println(i);
                sum += i;
                counter++;
            }
            if(counter == 5) {
                break;
            }
        }
        System.out.println("Sum of first 5 numbers: " + sum);
    }
}
