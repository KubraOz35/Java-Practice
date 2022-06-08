package lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP03 {

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
        printElements(l);
        System.out.println();
        printEvenElements(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfDistinctElements(l);
        System.out.println();
        getMaxElement(l);
        System.out.println();
        getMinimumEvenGreaterThanSeven(l);
        System.out.println();
        halfOfDistinctElementsGreaterThanFive(l);
        System.out.println();
        printSumOfDistinctEvenElements(l);
        System.out.println();
        printProductOfCubesOfDistinctEvenElements(l);
        System.out.println();
    }
    //Create a method to print the list elements on the console in the same line with a space

    public static void printElements(List<Integer> list) {
        list.stream().forEach(Utils::printInSamaLineWithSpace);

    }
//2)Create a method to print the even list elements on the console in the same line with a space
// between two consecutive elements.(Structured)

    public static void printEvenElements(List<Integer> list) {
        list.stream().filter(Utils::checkToBeEven).forEach(Utils::printInSamaLineWithSpace);
        //       t->t%2==0                    t->System.out.ptintln(t+" ");
    }

    //3)Create a method to print the square of odd list elements on the console in the same line with a
    // space between two consecutive elements.
    public static void printSquareOfOddElements(List<Integer> list) {
        list.stream().
                filter(Utils::checkToBeOdd).
                map(Utils::getSquare).
                forEach(Utils::printInSamaLineWithSpace);
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //with a space between two consecutive elements.
    public static void printCubeOfDistinctElements(List<Integer> list) {
        list.stream().distinct().
                filter(Utils::checkToBeOdd).
                map(Utils::printCube).
                forEach(Utils::printInSamaLineWithSpace);
    }

    //5)Create a method to find the maximum value from the list elements ==> stream, distinct,
    public static void getMaxElement(List<Integer> list) {
        Integer max = list.stream().distinct().
                reduce(Integer.MIN_VALUE, Math::max);//math class has own methods,and very useful

        System.out.println(max);
    }
//7)Create a method to find the minimum value which is greater than 7 and even from the list
//more than 7, even, min value

    public static void getMinimumEvenGreaterThanSeven(List<Integer> list) {

        Integer minEvenValueGreaterThanSeven = list.stream().
                distinct().
                filter(t -> t > 7).
                filter(Utils::checkToBeEven).
                reduce(Integer.MAX_VALUE, Math::min);

        System.out.println(minEvenValueGreaterThanSeven);


    }

    //8)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.

    public static void halfOfDistinctElementsGreaterThanFive(List<Integer> list) {
        List<Double> newList = list.stream().distinct().
                filter(t -> t > 5).
                map(Utils::getHalf).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

        System.out.println(newList);
    }
    //9)Create a method to calculate the sum of the squares of distinct even elements

     public static void printSumOfDistinctEvenElements(List<Integer> list) {
        Integer sum = list.stream().distinct().
                filter(Utils::checkToBeEven).
                map(Utils::getSquare).
                reduce(0,Math::addExact);
        System.out.println(sum);
    }

    //10)Create a method to calculate the product of the cubes of distinct even elements
    public static void printProductOfCubesOfDistinctEvenElements(List<Integer> list) {
        Integer product = list.stream().distinct().
                filter(Utils::checkToBeEven).
                map(Utils::printCube).
                reduce(1, Math::multiplyExact);
        System.out.println(product);
    }
}















