package practice02Repeated;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
              /*
                    Write a Java program to take the last three characters
                    from a given string and add these three characters
                      at both the front and back of the string.
                      String length must be at least three and more.
                         INPUT      : Ankara
                         OUTPUT  : araAnkaraara
             */

             Scanner scan=new Scanner(System.in);
             System.out.println("Enter a string");
             String str= scan.nextLine().trim();

             if (str.length()>2){
                 System.out.println(str.substring(str.length()-3)+str+str.substring(str.length()-3));
             }else{
                 System.out.println("Please enter a string which has at least 3 character");
             }

//****************************************************************************************************************

          String city="Edmonton";
          if (city.length()>4){
              System.out.println(city.substring(city.length()-4)+ city + city.substring(city.length()-4));
          }else{
              System.out.println("please watch you character count");
          }

          //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

          String str1="Ankara";

          String str2= str1.substring(str1.length()-2) +     str1    +   str1.substring(str1.length()-2);

          System.out.println(str2);



    }
}
