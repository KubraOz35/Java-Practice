package replitExcercises;

import java.util.Arrays;

public class MaxMinArray {
    public static void main(String[] args) {
     /*   Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

        Input : {3,2,5,4,1,6}*/

        int arr[] = {3, 2, 5, 4, 1, 6};
        mymethod(arr);
    }

    public static void mymethod(int arr []){

        Arrays.sort(arr);


        int min = arr[0];
        int max = arr[arr.length - 1];

        System.out.println("Min value is:" + min + " Max value is:" + max);


    }
}