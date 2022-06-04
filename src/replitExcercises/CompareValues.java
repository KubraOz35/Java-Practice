package replitExcercises;

import java.util.Scanner;

public class CompareValues {
    public static void main(String[] args) {

        //ask 3 number and get the smallest one

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number1 = scan.nextInt();
        System.out.println("Please enter the second number");
        int number2 = scan.nextInt();
        System.out.println("Please enter the third number");
        int number3 = scan.nextInt();

        if (number1<number2 && number1<number3 ){
            System.out.println(number1+" is the smallest number");
        }else if(number2<1 && number2<number3){
            System.out.println(number2+ " is the smallest number");
        }else  if(number3<number1 && number3<number2){
            System.out.println(number3+" is the smallest number");
        }else if(number1 == number2 || number1 == number3 || number2==number3){
            System.out.println("Numbers are same");

        }






    }
}
