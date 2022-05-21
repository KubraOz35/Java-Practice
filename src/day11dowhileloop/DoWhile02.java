package day11dowhileloop;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
        /*
        Ask user to enter an integer.
        If the integer is less than 100, tell user "won!"
        Otherwise, tell user "Lost!"
        If user wins, ask another integer-until loosing.*/


        Scanner scan = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Enter an integer");
            num = scan.nextInt();

            if (num < 100) {
                System.out.println("Congrats,WON!!");

            }
        } while (num < 100);
        System.out.println("Lost,Try Again");

            /*/*
     Username is "admin", Password is "pwd123"
     Ask user to enter username and password
     User should see "Enter your username and password" message

     If he enters correct credentials he should get "You are in your account!" message

     Otherwise, he should see "Enter your username and password" message 3 times

     After 3 times he should get "Your account is blocked" message
 */

        Scanner scanner = new Scanner(System.in);
        String userName = "";
        String password = "";
        int counter = 0;
        do {
            if (counter == 3) {
                System.out.println("Your account is blocked..");
                break;//WATCH BREAKS!!!!
            }
            System.out.println("Enter your username..");
            userName = scanner.next();
            System.out.println("Enter your password");
            password = scanner.next();
            if (userName.equals("admin") && password.equals("pwd123")) {
                System.out.println("You are in your account..");
                break;
            }
            counter++;
        } while (counter < 4);


    }


}

