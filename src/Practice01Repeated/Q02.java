package Practice01Repeated;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {

       /*
              Ask user to enter his kid's name,
              if the name contains both "a" and "z"  output will be "This name contains 'a'"
              if the name contains "a"               output will be "This name contains 'a'."
              if the name contains "z"               output will be "This name contains 'z'."
              Otherwise, output will be             "This name contains neither 'a' nor 'z'."

                                                                                                                 */
           Scanner scan = new Scanner(System.in);
           System.out.println("enter your kid's name..");
           String name =scan.next().toLowerCase();
                            //next line get whole name,if he has a second name also check it//next() check just the first part

           if (name.contains("a")  && name.contains("z")){
               System.out.println("This name contains 'a' ");
           }
           else if(name.contains("a")){
               System.out.println("This name contains 'a' ");
           }
           else if (name.contains("z")){
               System.out.println("This name contains 'z'.");
           }
           else{
               System.out.println( "This name contains neither 'a' nor 'z'.");
           }










    }
}
