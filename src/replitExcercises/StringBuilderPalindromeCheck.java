package replitExcercises;

import java.util.Scanner;

public class StringBuilderPalindromeCheck {
    public static void main(String[] args) {
      /*Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder
       and checks if sentence is palindrome or not (without case sensitivity).Use StringBuilder.
       Input :I love Java.
        Output:Reversed sentence : avaJ evol I. It is not a palindrome"*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String str = scan.nextLine();


        StringBuilder sb=new StringBuilder();//bos bir SB olusturduk
        sb.append(str);//icine kullanicidan aldigimiz(str) i ekledik
        sb.reverse();
        System.out.println(sb);//.avaJ evol I


        String stringFromStringBuilder =sb.toString();
        String reversedSb=sb.reverse().toString();


        if(stringFromStringBuilder.equals(reversedSb)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }


    }
}
