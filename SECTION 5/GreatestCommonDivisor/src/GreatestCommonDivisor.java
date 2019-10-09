/*      Write a method named getGreatestCommonDivisor with two parameters of type int named first and second.
        If one of the parameters is < 10, the method should return -1 to indicate an invalid value.
        The method should return the greatest common divisor of the two numbers (int).
*/

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if((first < 10) || (second < 10)){
            return -1;
        }
        for(int i = first; i > 0; i--){
            if(((first % i) == 0) && ((second % i) == 0)) {
                return i;
            }
        }
        return 1;
    }
}
