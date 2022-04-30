package replitExcercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchSumGivenNumber {
    public static void main(String[] args) {


        int number=0;
        int count=0;
        int sum=0;
        Scanner scan=new Scanner(System.in);

        try{
            while (number<10000  ){

                System.out.println("Enter a number,when you wanna stop enter a button except than number");
                number= scan.nextInt();
                sum+=number;
                count++;
            }
        }catch (InputMismatchException e){
            System.out.println("girdiginiz " + count + " adet sayinin toplami: " + sum );
        }




    }

    }
