package replitExcercises;

import java.util.Arrays;
import java.util.Scanner;

public class NumaraninKatiniArrayeYaz {

    //Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.
//iki ayri yolla gostermek icin for loop and do while olusturduk

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter two integer");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        multiples(num1, num2);
        secondWay(num1, num2);
    }

    public static void multiples(int a, int b) {

        int arr[] = new int[b];

        int multi = 1;
        for (int i = 0; i < b; i++) {
            arr[i] = multi * a;
            multi++;
        }

        System.out.println("from for loop" + Arrays.toString(arr));
    }

    public static void secondWay(int a, int b) {

        int arr[] = new int[b];

        int multi = 1;
        int i = 0;
        do {
            arr[i] = multi * a;
            multi++;
            i++;
        }
        while (i < arr.length);

        System.out.println("from do while " + Arrays.toString(arr));


    }
}