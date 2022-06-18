package day20practiceinterview;

import java.util.Arrays;
import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /* Type a code that takes array and
   returns the difference between the biggest and the smallest numbers.
   Ask user to enter array elements.
 */


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the array");//firstly i need to learn array capacity
        int length= scan.nextInt();

        int array[]=new int[length];//created array

        int i = 0;
        do{
            System.out.println("Enter the element that index of : " + i);//this do-while part for getting element from user
            array[i] = scan.nextInt();
            i++;
        } while(i < length);
        System.out.println(Arrays.toString(array));//printed array with it's elements

        Arrays.sort(array);//sorted from smallest to greatest

        System.out.println(Arrays.toString(array));

        int difference = array[length-1] - array[0];//took difference

        System.out.println("The difference between smallest and largest : " + difference);
    }
}
