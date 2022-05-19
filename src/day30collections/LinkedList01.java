package day30collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {


        LinkedList<Integer> ll3 = new LinkedList<>();
        ll3.add(0, 12);//When I want to use order for the elements, I can place at specific indexes my list elements
        ll3.add(1, 13);
        ll3.add(2, 10);
        ll3.add(3, 11);

        System.out.println(ll3);

        Integer first1 = ll3.remove();//retrieve the first element and will remove it from the list
        System.out.println(first1);
        System.out.println(ll3);

        Integer first2 = ll3.remove(2); //retrieve the first element and will remove it from the list
        System.out.println(first2);
        System.out.println(ll3);//[13, 10]


    }


}