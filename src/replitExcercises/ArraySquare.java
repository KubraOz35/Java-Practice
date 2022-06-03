package replitExcercises;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ArraySquare {
    public static void main(String[] args) {

    /*  Degerlerini kullanicidan alacaginiz bir integer list olusturunuz ve listedeki tum
    sayilarin karesinin toplamini bulunuz. Sonucu ekrana yazdiriniz.

      1st way:
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer for adding list \nTo stop enter character different from integer");

        int sum = 0;
        int counter = 0;
        try {
            while (counter < 10000) {
                int num = scan.nextInt();
                list.add(num);
                sum += num * num;
            }
        } catch (InputMismatchException e) {
            System.out.println("The sum of squares of numbers is " + sum);
        }

        System.out.println(list);
*/
        //2nd way:
        Scanner scan = new Scanner(System.in);
        System.out.println("enter an integer");

        List<Integer>list=new ArrayList<>();

        String str="";

        while(!str.equals("*")){
            str=scan.next();
            if (!str.equals("*")){
                list.add(Integer.valueOf(str));
            }
        }
        System.out.println(list);

        int  squareSum=0;
        for (int w :list){
            squareSum+=w*w;
        }
        System.out.println(squareSum);

    }}




