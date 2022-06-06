package replitExcercises;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapFruitCalories {
    public static void main(String[] args) {


Map FruitCalories = new HashMap<>();
        FruitCalories.put("apple",95);                  //map is not inherit from collections that's why we can't use ADD method here
        FruitCalories.put("lemon",20);
        FruitCalories.put("banana",105);
        FruitCalories.put("orange",45);
        FruitCalories.put("lemon",17);


      //!! 2.Way of adding element to Map    ==>
        Map FruitCalories2 =Map.of("plum",30,"pear",70);


        System.out.println(FruitCalories.size());                //4-unique olanlari saydigi icin 4 cikiyor ,tekrar edenleri update yaparak son hali ile 1 kez yazdiriyor
        System.out.println(FruitCalories);                       //{banana=105, orange=45, apple=95, lemon=17}

        System.out.println(FruitCalories.get("lemon"));           //17
        System.out.println(FruitCalories.entrySet());             //[banana=105, orange=45, apple=95, lemon=17]
        FruitCalories.replace("apple", 70);
        FruitCalories.remove("orange");
        //{banana=105, apple=95, lemon=17}


     /*   Set<String> keys=FruitCalories.keySet();                   //Printing the keys
        for (String w: keys){                                      //banana apple lemon
            System.out.print(w + " ");
        }

        Collection<Integer> values=FruitCalories.values();            // Printing the values
        for(Integer x : values) {                                     // 105 95 17
            System.out.print(x + " ");


        }

*/


    }
}
