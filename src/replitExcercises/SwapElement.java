package replitExcercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapElement {
    public static void main(String[] args) {
//Create a 10-element list. Swap the 8th element with the 3rd element.
//
//INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
//
//Output:
//
//[Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]

        String myArray[] = {"Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"};
        List<String> list = new ArrayList<>();// List<String> list2=Arrays.asList(myArray); ASLIST ile tum elementler birden atanabilir
        list.add("Umit");
        list.add("Emin");
        list.add("Kemal");
        list.add("Kerem");
        list.add("Taylan");
        list.add("Orhan");
        list.add("Sinan");
        list.add("Furkan");
        list.add("Ahmet");
        list.add("Ali");
        System.out.println(list);//[Umit, Emin, Kemal, Kerem, Taylan, Orhan, Sinan, Furkan, Ahmet, Ali]

        Collections.swap(list,8,3);
        System.out.println(list);//[Umit, Emin, Kemal, Ahmet, Taylan, Orhan, Sinan, Furkan, Kerem, Ali]

        ///////




    }

}