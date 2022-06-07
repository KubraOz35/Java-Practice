package replitExcercises;

import java.util.*;

public class TryCatchOutOfArrayIndex {
    public static void main(String[] args) {

        int arr[] = {2, 4, 9, 12, 78, 45, 6, 2, 54, 2, 36, 2};


        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter an index number for printing the element ");
            int index = scan.nextInt();

            System.out.println("the index of you given is : " + arr[index]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This array doesnt have the index that you entered");
        }catch(InputMismatchException e){
            System.out.println("Please enter a positive number");
        }



    }

}
