public class Main<finishNumber> {
    public static void main(String[] args) {
        int count = 0;
        while(count != 5){
            System.out.println("Count is " + count);
            count ++;
        }
        count = 0;
        do {
            System.out.println("Count is " + count);
            count++;
        } while(count != 5);

        int number = 0;
        int finishNumber = 40;
        count = 0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("Even number " + number);
            if(count == 5){
                System.out.println("Even numbers found: " + count);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
}
