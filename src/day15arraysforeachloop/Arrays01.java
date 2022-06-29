package day15arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {

    public static void main(String[] args) {

    //Sort the elements according to their length==>"Ali","Veli","Maria", "Michael"

        String str[]= {"Veli", "Michael", "Ali", "Maria"};

        System.out.println(Arrays.toString(str));

        Arrays.sort(str, Comparator.comparingInt(String::length));

        System.out.println(Arrays.toString(str));

    //Sort the elements  according to their length in descending order

        String ttr[]= {"Veli", "Michael", "Ali", "Maria"};//[ "Michael", "Maria","Veli","Ali"]

        Arrays.sort(ttr,Comparator.comparingInt(String::length).reversed());

        System.out.println(Arrays.toString(ttr));


        //Sort the elements  according to their length in descending order
       //If the elements are in the same length,put them in alphabetical order.'Michael"-Maria"-"Ayse"-"Veli"-"Ali"-"Can"-"Tan"
        String urr [] = {"Veli","Can", "Micheal", "Ayse", "Ali","Maria","Tan"};
        //naturalOrder() means alphabetical order in Strings, ascending in numbers.
        Arrays.sort(urr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(urr));



    }
}
