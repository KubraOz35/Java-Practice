package replitExcercises;

import java.util.*;

public class HashMapWordCounter {
    public static void main(String[] args) {

       /* How to count the number of occurrences of the letters(alphabetical characters) in a sentence
        For example; "Java is easy. Type codes to learn Java. To earn money learn Java."
        j=.., a=..,
        Make code case insensitive.*/

        String str="I think I will miss Java.";
        String []arr=str.replaceAll("[^A-Za-z]","").toLowerCase().split("");
        System.out.println(Arrays.toString(arr));

        HashMap<String,Integer>myMap=new HashMap<>();
        for (String w:arr){
        if (!myMap.containsKey(w)){
            myMap.put(w,1);//eger map elementi icermiyorsa yazdirsin ve 1 koysun
        }else{
            myMap.put(w,myMap.get(w)+1);//ama daha onceden iceriyorsa key ayni kalsin, value 1 artarak yazdirsin
        }

        }
        System.out.println(myMap);



















    }


}







