/*      Write a method named getLargestPrime with one parameter of type int named number.
        If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
        The method should calculate the largest prime factor of a given number and return it.*/

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if(number <= 1){
            return -1;
        }
        int i;
        for(i = 2; i <= number; i++){
            if (number % i == 0){
                number /= i;
                i--;
            }
        }
        return i;
    }
}