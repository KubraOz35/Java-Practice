package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HomePractice {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);

        print(l);
        System.out.println();
        evenPrint(l);
        System.out.println();
        oddSquare(l);
        System.out.println();
        cubeDistinct(l);
        System.out.println();
        maxValue(l);
        System.out.println();
        minValue(l);
        System.out.println();
        minValueGreater7(l);
        System.out.println();
        half(l);
        System.out.println();
        sum(l);
        System.out.println();
        product(l);
        System.out.println();

    }

    public static void print(List<Integer> myList) {
        myList.stream().forEach(t -> System.out.print(t + " "));

    }

    public static void evenPrint(List<Integer> myList) {
        myList.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    public static void oddSquare(List<Integer> myList) {
        myList.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    public static void cubeDistinct(List<Integer> myList) {
        myList.stream().distinct().filter(t -> t % 2 != 0).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
    }

    //the maximum value from the list elements
    public static void maxValue(List<Integer> myList) {
        int max = myList.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.print(max);
    }

    public static void minValue(List<Integer> myList) {
        int min = myList.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.print(min);
    }

    //7)Create a method to find the minimum value which is greater than 7 and even from the list
    public static void minValueGreater7(List<Integer> myList) {
        int sayi = myList.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t > 7).reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.print(sayi);
    }

    public static void half(List<Integer> myList) {
        //8)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
        List<Double> no = myList.stream().distinct().filter(t -> t > 5).map(t -> t / 2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.print(no);
    }

    //9)Create a method to calculate the sum of the squares of distinct even elements
    public static void sum(List<Integer> myList) {
        int sum = myList.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.print(sum);
    }

    //10)Create a method to calculate the product of the cubes of distinct even elements
    public static void product(List<Integer> myList) {
        int product = myList.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.print(product);


    }

}


