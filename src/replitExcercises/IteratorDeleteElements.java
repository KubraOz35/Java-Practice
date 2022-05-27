package replitExcercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDeleteElements {
    public static void main(String[] args) {
        List<String> mylist=new ArrayList<>();
        mylist.add("Ali");
        mylist.add("VELI");
        mylist.add("Can");
        mylist.add("Han");

        System.out.println(mylist);

       /* mylist.clear();//remove all  elements in list
        System.out.println(mylist);*/

        Iterator<String>itr=mylist.iterator();
        while(itr.hasNext()){
            itr.next();
            itr.remove();
        }
        System.out.println(mylist);



    }

}
