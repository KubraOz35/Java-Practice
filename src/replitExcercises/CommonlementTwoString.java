package replitExcercises;

import java.util.ArrayList;
import java.util.List;

public class CommonlementTwoString {
    public static void main(String[] args) {

      /*  Write a program to find the common elements between two String Arrays (without case sensitivity)

    Input1 : {John,Brad,Ange,Sofia,Emily}

    Input2 : {sofia,brad,grace,emily,hazel}

    Output : [sofia,brad,emily]*/


        String[] arr1 = {"John", "Brad", "Ange", "Sofia", "Emily"};

        String[] arr2 = {"sofia", "brad", "grace", "emily", "hazel"};

        List<String> arr3 = new ArrayList<>();

        for (String w : arr1) {

            for (String x : arr2) {

                if (w.equalsIgnoreCase(x)) {

                    arr3.add(w);
                }
            }

        }
        System.out.println(arr3);

    }


}

