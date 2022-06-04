package replitExcercises;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorRemoveEvenElement {
    public static void main(String[] args) {


        List<Integer> list1=new ArrayList<>();
        list1.add(2);
        list1.add(26);
        list1.add(5);
        list1.add(19);
        list1.add(7);
        list1.add(8);

        ListIterator<Integer> iterator=list1.listIterator();

        while(iterator.hasNext()){
            if(iterator.next()%2==0){

                iterator.remove();
            }
        }

        System.out.println(list1);//[5, 19, 7]



    }
}
