package replitExcercises;

import java.util.Arrays;

public class Split {

     /*   String arr= "John";

        String Array[]=arr.split("");

        System.out.println(Arrays.toString(Array));

        System.out.println( Array.length);//string in uzunlugunu alma*/

        public static void main(String[] args) {

            String abc = "John is from Germany but he born in Turkey";
            countWords(abc);
        }

        public static void countWords(String str){

            String arr[] = str.split(" ");
            System.out.println( arr.length);


        }
}
