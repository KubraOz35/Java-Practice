package day11dowhileloop;

import java.util.Scanner;

public class SlideQuestionsDoWhileLoop {
    public static void main(String[] args) {
        //1) Write a program to print numbers from 1 to 5 on the console by using do-while loop.

        int a = 0;
        do {
            System.out.print(a + "");
            a++;

        } while (a < 6);
        System.out.println("*****************");

        //2)Write a program to print numbers from 10 to 3 on the console by using do-while loop.

        int b = 10;
        do {
            System.out.println(b + "");
            b--;
        } while (b > 2);

        System.out.println("******************");


        //3)Write a program to print numbers which are divisible by 5 between 1 and 100 on the console
        //by using do-while loop

        int c = 1;
        do {
            if (c % 5 == 0){
                System.out.print(c + " ");}
            c++;

        } while (c < 101);
        System.out.println("**********************");

        //4) Write a program to print letters from c to m on the console by using do-while loop

        char d = 'c';

        do {
            System.out.println(d + "");
            d++;
        } while (d < 'n');
        System.out.println("************************");

        //5) Ask user to enter a number.
        //If the number is divisible by 10 then print "Won!" on the console
        //otherwise ask user to enter another number.
        //Use do-while loop.

        Scanner scan = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Enter an integer");
            num = scan.nextInt();

            if (num % 10 == 0) {
                System.out.println("Congrats,WON!!");

            }
        } while (num % 10 != 0);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        //6) Ask user to enter a name.
        //If the name contains the letter ‘a’ then print "Won!" on the console
        //otherwise ask user to enter another name.
        //Use do-while loop.

        Scanner scanner = new Scanner(System.in);
        String name = "";
        do {
            System.out.println("Enter a name");
            name = scan.next();
            if (name.contains("a")) {
            System.out.println("Won!!");
        }
        } while (!name.contains("a"));


        System.out.println("////////////////////////////");

        //7)//For example; Germany ==> e m n
        //Print the characters whose indexes are odd on the console

        Scanner sca=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sca.next();
        int strlength = str.length();

        int i=0;
        do {
            if (i % 2 == 1){
                System.out.println(str.charAt(i));
            }
            i++;
        } while (i < strlength) ;


        }
    }






