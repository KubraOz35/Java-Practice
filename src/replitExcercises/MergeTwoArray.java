package replitExcercises;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {


      /*  Write a return method that accepts 2 integer Arrays as parameters And adds 2 array into a new Array and prints it.
Input1={1,2,3,4}     Input2={5,6}
        Output={1,2,3,4,5,6}*/

        int arr[] = {1, 2, 3, 4};
        int brr[] = {5, 6};

        merge(arr, brr);
    }

    public static void merge(int arr[], int brr[]) {

        int crr[] = new int[arr.length + brr.length];

        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            crr[i] = arr[i];
            j++;
        }
        int x = 0;
        for (int i = arr.length; i < crr.length; i++) {
            crr[i] = brr[x];
            x++;
        }

        System.out.println(Arrays.toString(crr));
    }
}
////
/*

 int arr1 [] = {1,2,3,4};
        int arr2  []= {5,6};

        int[] arr3 = new int[arr1.length + arr2.length];

        int sum = 0;
        for (int i : arr1) {
            arr3[sum] = i;
            sum++;
        }

        for (int i : arr2) {
            arr3[sum] = i;
            sum++;
        }

        System.out.println(Arrays.toString(arr3));
 */
























