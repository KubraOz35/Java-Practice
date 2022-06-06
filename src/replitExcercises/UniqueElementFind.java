package replitExcercises;

import java.util.*;

public class UniqueElementFind {
    public static void main(String[] args) {

//Interview Question: Type a code to display arrayList elements only once.

        //1.Way :with loop

        String st = "patates";
        String[] arr = st.split("");
        List<String> list = Arrays.asList(arr);//altin kaplama yuzuk gibi,aslinda list gibi gozukuyor arrayin elementlerini icine aldi ama sadcde uzunlukla(size) ilgili methot kullanamayiz
                                               //remove,add methodunu da kullanamayiz uzunlukla ilgili oldugu icin
        TreeSet<String> hs = new TreeSet<>(list);
        System.out.println(hs);

    /*   //2.Way :with hashSet

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);//[5, 5, 2, 3, 2, 3, 5]
        HashSet<Integer> hs3 = new HashSet<>(list);



     */

        String t = "Yumurta";

        for (int i = 0; i < t.length(); i += 1) {

            if (t.indexOf(t.charAt(i)) == t.lastIndexOf(t.charAt(i))) {//y nin ilk indeksini aliyor son indeksi ile kiyasliyor,eger yoksa unique oluyor ve yazdiriyur

                System.out.println(t.charAt(i));

            }
        }
    }}