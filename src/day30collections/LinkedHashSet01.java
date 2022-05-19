package day30collections;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSet01 {
    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs1= new LinkedHashSet<>();
        lhs1.add(12);
        lhs1.add(33);
        lhs1.add(10);
        lhs1.add(32);
        lhs1.add(5);
        lhs1.add(5);
        lhs1.add(5);
        System.out.println(lhs1);//[12, 33, 10, 32, 5]

        List<Integer>list=new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(list);//[5, 3, 2, 5, 2, 3]


        //Interview question: Display all arraylist elements at once on the console

        LinkedHashSet<Integer> lhs2= new LinkedHashSet<>();
        lhs2.addAll(list);//you can add list here like this or you should put in the last paranthesis in hashset" LinkedHashSet<Integer> lhs2= new LinkedHashSet<>(list);"
                          //both are true
        System.out.println(lhs2);//[5, 3, 2]

















}
}