package replitExcercises;

import java.util.Scanner;

public class ReversedMethodCall {
    public static void main(String[] args) {
/*Get a sentence from the user. Accept the sentence received from the user as a parameter, Invert sentence using Array and write a Method that returns the result as a String to the main method.

Note: Upper and lower case letters, spaces and special characters will not be changed.

Input :

It is very nice to write code.

Output :

.edoc etirw ot ecin yrev si tI*/
        //soruyu  method call ekleyerek dene


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String array = scan.nextLine();

        System.out.println(reversedmethod(array));
        System.out.println("**************");

        String m="how are you feeling";
        String s = "java is easy";//methodu tekrar tekrar kullanabildigimi gormek icin ornek strin olusturdum
        System.out.println(reversedmethod(s));
        System.out.println(reversedmethod(m));


    }

    public static String reversedmethod(String a) {//void kullanmadigimda data type yap:1-String b;null olustur,2-sonra for loop un altinda b yi tanimla
        //3-return b yap cagir son adim ana methoddda reversed u sout un icine al yazdirmak icin

        String sentencearr[] = a.split("");
        String b="";

        for (int i = sentencearr.length - 1; i >= 0; i--) {
            b=b+ sentencearr[i];

        }


        return b;

    }




}