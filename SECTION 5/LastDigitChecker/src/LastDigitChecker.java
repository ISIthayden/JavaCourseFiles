/*      Write a method named hasSameLastDigit with three parameters of type int.
        Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within
        the range, the method should return false.
        The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it
        should return false.

        Write another method named isValid with one parameter of type int.
        The method needs to return true if the number parameter is in range of 10(inclusive) - 1000(inclusive),
        otherwise return false.
*/

public class LastDigitChecker {
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber){
        if((!isValid(firstNumber)) || (!isValid(secondNumber)) || (!isValid(thirdNumber))){
            return false;
        }
        if((firstNumber % 10) == (secondNumber % 10) ||
                (firstNumber % 10) == (thirdNumber % 10) ||
                (secondNumber % 10) == (thirdNumber % 10)){
            return true;
        }
        return false;
    }
    public static boolean isValid(int number){
        if((number < 10) || (number > 1000)){
            return false;
        }
        return true;
    }
}
