/*      Write a method called isPalindrome with one int parameter called number.
        The method needs to return a boolean.
        It should return true if the number is a palindrome number otherwise it should return false.*/

public class Palindrome {
    public static boolean isPalindrome(int number){
        if(number < 0){
            number = 0 - number;
        }

        int reversingVar = number;
        int reverse = 0;

        while(reversingVar != 0){
            reverse += (reversingVar % 10);
            if(reversingVar >= 10) {
                reverse *= 10;
            }
            reversingVar /= 10;
        }

        if(reverse == number){
            return true;
        }
        else {
            return false;
        }
    }
}
