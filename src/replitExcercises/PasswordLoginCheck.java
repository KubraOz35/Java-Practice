package replitExcercises;

import java.util.Scanner;

public class PasswordLoginCheck {
    public static void main(String[] args) {
        /*
        Create a password, which starts with Uppercase and contains at least one digit.
        The length of the password should be 8.
 */
        Scanner scan = new Scanner(System.in);

        boolean pswdCorrect=false;

        int counter = 1;
        do {
            if(counter==4) {
                System.out.println("Your account is blocked");
                break;
            }

            System.out.println("Please enter your password");
            String pswd = scan.nextLine();


            for (int i = 0; i < pswd.length(); i++) {
                if ((pswd.charAt(i) > '0' && pswd.charAt(i) < '9') && pswd.length() == 8 && (pswd.charAt(0) > 'A' && pswd.charAt(0) < 'Z')) {

                    System.out.println("Valid password");
                    pswdCorrect=true;
                    break;
                }
            }
            if(pswdCorrect){
                break;
            }else {

                System.out.println("Invalid password");
                counter++;
            }

        } while (counter <= 4);


    }}