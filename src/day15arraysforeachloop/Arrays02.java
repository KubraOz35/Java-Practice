package day15arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Check if the array elements are in natural order.
        //"A"-"B"-"C"==>Natural order
        //"A"-"C"-"B"==>NOT Natural order

        String abc[] = {"Ayhan", "Ceyhan", "Beyhan"};
        System.out.println(Arrays.toString(abc));
        //Create a new array and put the elements into the array
        //If you want to keep original array same,transfer elements one by one by using for loop.You will have same elements in two different reserved area

        String bbc[] = new String[3];//created a new array,it is empty

        for (int i = 0; i < 3; i++) {
            bbc[i] = abc[i];
        }

        Arrays.sort(bbc);
        if (Arrays.equals(abc, bbc)) {
            System.out.println("*****Natural order***");
        } else {
            System.out.println("****Not natural order***");
        }


        //Correct Solution 2:
        String str[] = {"Ayhan", "Ceyhan", "Beyhan"};
        //If you want to keep original array same ,use copyOf() method
        //By using copyOf() method you will have same elements in 2 different reserved area.
        String ktr[] = Arrays.copyOf(str, 3);

        Arrays.sort(ktr);

        if (Arrays.equals(str, ktr)) {
            System.out.println("===Natural oreder===");
        } else {
            System.out.println("===Not Natural order===");
        }





        /*//   This is WRONG SOLUTION:Common Mistake,pay attention

        String bbc[]=abc;//we cant assign like this
        System.out.println(Arrays.toString(abc));

        Arrays.sort(bbc);

        if (Arrays.equals(abc,bbc)){
            System.out.println("Natural order");
        } else{
            System.out.println("Not Natural order");
        }*/


    }
}
