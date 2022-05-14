package practice08;

import java.util.Arrays;
import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
/*
   Create an array and create a  method to find the number of positive numbers and sum of
the non-positive numbers
Return type must be int array
[a,b]
 */

        int arr[] = {2,6,1,5,-3,-9,-7,-2};
        System.out.println(Arrays.toString(find(arr)));

    }

    public static int [] find(int arr[]) {

        int numOfPositive = 0;
        int nonPositiveSum = 0;

        for (int w : arr) {
            if (w > 0) {
                numOfPositive++;

            } else {
                nonPositiveSum += w;
            }
        }

    int result []={numOfPositive,nonPositiveSum};
        return result;

        }}

