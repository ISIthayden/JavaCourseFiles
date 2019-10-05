public class SecondsAndMinutes {
    public static String getDurationString(int minutes, int seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return "Invalid Value";
        }
        return (minutes / 60) + "h " + (minutes % 60) + "m " + seconds + "s";
    }
    public static String getDurationString(int seconds){
        if(seconds < 0){
            return "Invalid Value";
        }
        return getDurationString(seconds / 60, seconds % 60);
    }
}