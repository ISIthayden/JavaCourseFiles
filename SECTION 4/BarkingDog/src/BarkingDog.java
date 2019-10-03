public class BarkingDog
{
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (isBarking == true) {
            if (((hourOfDay > 22) && (hourOfDay < 24)) || ((hourOfDay >= 0) && (hourOfDay < 8))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}