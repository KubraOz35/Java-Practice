package replitExcercises;

import java.util.ArrayList;
import java.util.List;

public class DeleteLetterFromArray {
    public static void main(String[] args) {

      /*  Write a program that deletes the letters 'a' from the names in the list given as input.

                INPUT :
        list1={"Ali","Veli","Ayse","Fatma","Omer"}

        OUTPUT :   [Veli,Omer]*/

        List<String> list=new ArrayList<>();

        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");
        list.add("Fatma");
        list.add("Omer");
        System.out.println(list);//[Ali, Veli, Ayse, Fatma, Omer]

        ArrayList<String> newlist = new ArrayList<>();//yeni liste olusturdum
        ArrayList<String> trylist = (ArrayList<String>) list;
        for (String w : list) {
            if ((!w.contains("a"))){
              newlist.add(w);
            }
        }   System.out.println(newlist);



    }
}
