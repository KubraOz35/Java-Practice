package lambda_functional_programming;

import java.util.List;

public class Utils {
    public static void printInSamaLineWithSpace(Object o) {
        System.out.print(o + " ");

    }

    public static void printAllElementWithStar(Object o) {
        System.out.print(o + "*");
    }

    public static boolean checkToBeEven(int x) {
        return x % 2 == 0;
    }

    public static boolean checkToBeOdd(int x) {
        return x % 2 != 0;
    }

    public static int getSquare(int x) {
        return x * x;
    }

    public static int printCube(int x) {
     return x*x*x;}

    public static double getHalf(int x) {
        return x / 2.0;}

    public static char getLastCharacter(String str){
     return str.charAt(str.length()-1);
  }
    public static char getFirstCharacter(String str){
        return str.charAt(str.charAt(0));
}}