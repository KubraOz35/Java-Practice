package practice08;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {



        /*
         * Ask user to enter 2 positive integer then find
         * GCD (The Greatest Common Divisor) and
         * (if user enter 30 and 40 GCD = 10 )
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two number");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int GCD = 1;
        for (int i = 2; i <= sayi1 && i <= sayi2; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                GCD = i;
            }
        }
        System.out.println(GCD);
    }
}