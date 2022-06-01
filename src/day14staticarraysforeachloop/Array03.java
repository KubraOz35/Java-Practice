package day14staticarraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class
Array03 {

    //Create an Array by getting array elements from user

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many elements will you store inside the array");
        int len = scan.nextInt();

        String sArray[] = new String[len];

        System.out.println(Arrays.toString(sArray));

        for (int i = 0; i < len; i++) {

            System.out.println("enter a string..");
            String el = scan.next();
            sArray[i] = el;
        }
        System.out.println(Arrays.toString(sArray));
    }



}