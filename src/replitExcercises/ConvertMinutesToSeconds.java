package replitExcercises;

public class ConvertMinutesToSeconds {
    public static void main(String[] args) {
        //Write a function that takes an integer minutes and converts it to seconds.
convert(10);
convert(5);
convert(20);

    }

    public static void convert(int a){

        int sec =60;
        System.out.println(a + " min is equal to "+ a*sec+" seconds" );

    }
}
    /*Create a function that takes the age in years and returns the age in days

      public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scan.nextInt();

        day(age);
    }
    public static void day(int a) {
        System.out.println(a*365);
*/

