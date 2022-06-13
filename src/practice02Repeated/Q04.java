package practice02Repeated;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
         /*
        Ask user to enter a name and a character,
        then check how many times the character is repeated in the name by using for loop(make code case-sensitive)
        Example:
        INPUT      :char ch1= 'a' ;
                 String name ="John came late";
       OUTPUT :  a is repeated 2 times in this String
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string");
        String str= scan.nextLine();

        System.out.println("Enter a character,if you enter more than one character I can just check first");
        char ch= scan.next().charAt(0);

        int counter=0;
        for (int i=0 ; i<str.length() ; i++){
            if (ch==str.charAt(i)){
                counter++;
            }
        }
        System.out.println(ch+" is repeated " + counter +" times in the string");


















    }
}
