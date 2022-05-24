package replitExcercises;

import java.util.Scanner;

public class ElseIfBasic {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int no=scan.nextInt();

        if (no<0) {
            System.out.println("it is a negative number");
        }else if(no>0){
            System.out.println("it is a positive number");
        }else{
            System.out.println("the number is zero");
        }

    }
}
