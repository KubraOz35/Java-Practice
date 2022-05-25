package replitExcercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class CountWordWriteWithMap {
    public static void main(String[] args) {
         /*
        How to count the number of occurrences of the words in a sentence
        For example; "Java is easy. Type codes to learn Java. To earn money learn Java."
                      Java=3, is=1, easy=1, Type=1, ... , learn=2, ...==>
 */


        String str = "Java is easy. Type codes to learn Java. To earn money learn Java.";//string olusturduk
        String arr[] = str.replaceAll("\\p{Punct}", "").split(" ");//String in elementlerini noktalamalari atip kelime kelime bolduk
        System.out.println(Arrays.toString(arr));

        HashMap<String, Integer> hm = new HashMap<>();//bos bir hashmaP actik

        for (String w : arr
        ) {
            Integer tekrarSayisi = hm.get(w);//string den alacgi kelimeleri tek tek map e yazdir dedik

            if (tekrarSayisi == null) {//ama yazdirirken say,ilk eklemede 0 olacagi icin hep key ve 1 sayisini yazacak
                hm.put(w, 1);
            } else {//eger tekrar sayisi null degilse daha once varmis demek o zaman onceki sayiya +1 yap
                hm.put(w, tekrarSayisi + 1);
            }

        }
        System.out.println(hm);//map i yazdir

        //harfleri saydir

        String brr[] = str.replaceAll(" ", "").replaceAll("\\p{Punct}", "").toLowerCase(Locale.ROOT).split("");
        System.out.println(Arrays.toString(brr));

        HashMap<String, Integer> myMap =new HashMap<>();


        for (String a :brr){
          Integer repeated=myMap.get(a);
            if (repeated==null){
                myMap.put(a,1);

            }else{
                myMap.put(a,repeated+1);
            }
        }
        System.out.println(myMap);



    }
}
