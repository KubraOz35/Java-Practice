package day20practiceinterview;

import java.util.Arrays;
import java.util.Scanner;

public class SelfStudy {
    public static void main(String[] args) {

        //Write a Java Program to swap two numbers
        //will be like this: a=10 and b=12

        int a = 8;
        int b = 20;

        int c = 0;

        c = a;
        a = b;
        b = c;

        System.out.println("a is: " + a + " b is :" + b);

////////////////////////////////////////////////////////////////////


        int num = 10;
        do {
            System.out.print(num-- + " ");

        } while (--num == 0);

        System.out.println(num);//10 8
        //do- while oldugu icin once action olacak 10 u oldugu gibi yazdiracak sonra degerini dusurecek,num-- deger 9 a d bekliyor 10 yazildiktan sonra
        //while dan sonraki partta ise --num degeri once dusurup sonra yazdiracak yani 9-1=8 olarak yazacak.
        // (--)sagda olmasi degeri once tut sonra yazdir,solda olmasi ise once degerini dusur sonra yazdir demek oluyor


//////////////////////////////////////////////////////////////////////////////

         /* Type a code that takes array and
   returns the difference between the biggest and the smallest numbers.
   Ask user to enter array elements.
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array length");
        int length = scan.nextInt();    //array i uzunlugunu ogrendik

        int[] myArray = new int[length];//array kalibimizi olusturduk

        int i = 0;
        do {
            System.out.println("enter the array elements");
            myArray[i] = scan.nextInt();
            i++;
        } while (i < length);
        System.out.println(Arrays.toString(myArray));//array in elementlerini yazdirdik

        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));//elementleri kucukten buyuge siraladik

        int difference = myArray[length - 1] - myArray[0];//en buyuk sayi ile en kucuk sayi arasindaki farki aldik

        System.out.println("difference is: " + difference);


        System.out.println("//////////////////////////////////////////");


////////////////////////////////////////////////////////////////////////////////////////

        /*
            Ebay Interview Questions
   Get a String and a character from user
   Count the number of characters between the first occurrence and the last occurrence of the given character in the String
   Do not count the space characters
   If the character which user selected is displayed just once in the String return -1
   If the character which user selected does not exist in the String return -1
   For example; "Java is easy" - 'a' ==> 5
                "Java is easy" - 'w' ==> -1
                "Java is easy" - 'e' ==> -1*/

        Scanner scan1=new Scanner(System.in);
        System.out.println("enter a string");
        String str=scan1.nextLine().replace(" ","");//removed space from taken  string

        System.out.println("enter a character");
        char ch=scan1.next().charAt(0);


        int firstOccurence=   str.indexOf(ch);
        int lastOccurence=    str.lastIndexOf(ch);


        int counter=0;
        if (firstOccurence==lastOccurence){
            System.out.println("-1");//if characater does not exist or unique run -1 in this question
        }else{
            for(int k =firstOccurence+1; k < lastOccurence; k++){
                    counter++;
                }

                System.out.println("Number of characters between first occurence and last occurence: " + counter);










    }}}