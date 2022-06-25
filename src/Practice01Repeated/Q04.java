package Practice01Repeated;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
       Ask user to enter a number. If the number is less than 10 and greater
       than or equal to 0, calculate its cube. Otherwise, calculate its square.
       Cube of a = a*a*a Square of a = a*a                                        */


        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number..");
        int a =scan.nextInt();


        int result= a>0 && a<=10   ?    a*a*a : a*a;
        System.out.println(result);






    }
}
