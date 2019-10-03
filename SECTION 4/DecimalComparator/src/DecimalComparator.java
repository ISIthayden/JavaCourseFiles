/*DecimalComparator
        Write a method areEqualByThreeDecimalPlaces with two parameters of type double.

        The method should return boolean and it needs to return true if two double numbers
        are the same up to three decimal places. Otherwise, return false.

        TIP: Use paper and pencil.

        TIP: Use casting.*/


public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        first = (int) (first * 1000);
        second = (int) (second * 1000);

        if(first == second){
            return true;
        }
        return false;
    }
}
