package replitExcercises;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorAddSign {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");
        list.add("Han");
        list.add("Tan");

        System.out.println(list);//[Ali, Veli, Can, Han, Tan]

     /*  for (String w:list
             ) {w=w +"*";

        }
        System.out.println(list );*/
        ListIterator<String> ltr=list.listIterator();
        while(ltr.hasNext()){
            String str=ltr.next();
            ltr.set(str+" *");
        }
        System.out.println(list);



    }
}



















