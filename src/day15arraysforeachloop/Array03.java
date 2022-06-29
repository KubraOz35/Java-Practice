package day15arraysforeachloop;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {
        //How to check an element if it exists in an array or not
        int arr[]={32,14,2,11};      // 2

        //1.Way:
        for (int w: arr){
            if (w==2){
                System.out.println( w+ " exist");
                break;
            }
        }

        //2.Way:
        Arrays.sort(arr);//for using binarySearch method we MUST sort array first//run and see result is 0 ,it means 0 Index,and it represents 2 after sorted
        System.out.println( Arrays.binarySearch(arr,0));//This method return us INDEX of element
        System.out.println(Arrays.binarySearch(arr,50));//method returns the ORDER number with a negative sign for non-existing elements



    }
}
