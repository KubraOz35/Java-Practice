package replitExcercises;

public class ReversedNumber {

     /*  public static void main(String[] args) {
            int number = 12345;
            reverse(number);
        }
        public static void reverse(int a) {
            for (int i = a; i > 0; i = i / 10) {
                System.out.print(i % 10);
            }
        }
    }
*/

    static int reverseDigits(int number) {
        int reversenumber = 0;
        while (number > 0) {
            reversenumber = reversenumber * 10 + number % 10;
            number = number / 10;
        }
        return reversenumber;
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("Reverse of number is " + reverseDigits(number));
    }
}