import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();

        Integer myIntValue = 56;
        int myInt = myIntValue.intValue();


        for(int i = 0; i <= 10; i++){
            intArrayList.add(i);
        }
        for(int i = 0; i <= 10; i++){
            System.out.println(i + " --> " + intArrayList.get(i));
        }
    }
}