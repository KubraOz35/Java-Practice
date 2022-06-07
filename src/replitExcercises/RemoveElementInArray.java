package replitExcercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementInArray {
    public static void main(String[] args) {
      /*  write a Java program to removes a specific element from an array and put the remaining elements in a new array and prints the new array

        Input :{1,2,3,4,5,6}

        element:6

        Output : [1,2,3,4,5]*/

        int[] myArray = {1, 2, 3, 4, 5, 6};
        int[] newArray = new int[myArray.length - 1];//1 element cikarilacagi icin -1 uzunlukta yeni bir array olusturdum

        for (int i = 0, j = 0; i < myArray.length - 1; i++) {
            if (i != 6) {
                newArray[j++] = myArray[i];
            }
        }

        System.out.println(Arrays.toString(newArray)+" ");


//2.way
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");


        int []array={1, 2, 3, 4, 5, 6};
        List<Integer>list=new ArrayList<>();

        for (int i=0;i<array.length;i++ ){
            list.add(array[i]);
        }
       Integer number=Integer.valueOf(6);
       list.remove(number);
        System.out.println(list);
    }
}
