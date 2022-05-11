package lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Practice2 {
    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");
        remove(l);
        remove2(l);
        remove3(l);
        System.out.println();
        System.out.println(checkLess12(l));
    }

    //Remove the elements if the length is between 8 and 10 or ending with 'o' (8 and 10 inclusive)
    public static void remove(List<String> list) {
        list.removeIf(t -> t.length() > 7 && t.length() < 11 || t.endsWith("o"));
        System.out.println(list);

    }

    public static void remove2(List<String> list) {
        Predicate<String> checkCondition = (t -> t.length() > 7 && t.length() < 11 || t.endsWith("o"));
        list.removeIf(t -> checkCondition.test(t));
        System.out.println(list);


    }

    //    6) Remove the elements if the length of the element is greater than 6
    public static void remove3(List<String> list) {
        Predicate<String> mylist = (t -> t.length() > 5);
        list.removeIf(t -> mylist.test(t));
        System.out.println(list);
    }

    //Create a method to check if the lengths of all elements are less than 12
    public static boolean checkLess12(List<String> list) {
       return  list.stream().allMatch(t->t.length()<12);

    }

}