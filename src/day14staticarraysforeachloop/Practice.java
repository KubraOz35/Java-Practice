package day14staticarraysforeachloop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int[] x = {1, 5, 8, 45, 84, 24, 6};
        System.out.println(Arrays.toString(x));
        System.out.println(x[0]);
        System.out.println(x.length - 1);

        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        System.out.println(sum);

        int product = 1;
        for (int i = 1; i < x.length; i++) {
            product *= x[i];
        }
        System.out.println(product);

        Arrays.sort(x);
        System.out.println(Arrays.toString(x));

        int sum2 = 0;
        for (int i = 0; i < x.length; i++) {
            if (i % 5 == 0)
                sum2 += x[i];
        }

        System.out.println(sum2);


        int[] array = new int[5];
        array[0] = 2;
        array[3] = 4;
        System.out.println(Arrays.toString(array));

        int a[] = {-12,34, 21, 0, -2, 34};
        int num = 34;

        int flag = 0;
        for (int i=0 ;i<a.length ; i++) {
            if (num == a[i]) {
                flag++;
            }
        }
        if (flag > 1) {
            System.out.println("exist");
        } else {
            System.out.println("not exist");
        }

       // ********************************

        int c[] = {-12,34, 21, 0, -2, 34};
        int num2 = 34;

        int counter = 0;
        for (int w : c) {
            if (w == num2) {
                counter++;
                break;
            }
        }
        if (counter == 0) {
            System.out.println(num2 + "does not exist");
        } else {
            System.out.println(num2 + "exists");


        }

            Scanner scan = new Scanner(System.in);
            System.out.println("How many elements will you store inside the array");
            int len = scan.nextInt();

            String [] arr=new String[len];

            for (int i=0 ; i<len ;i++){
                System.out.println("enter a name");
                String str = scan.next();
                arr[i]=str;
            }
        System.out.println(Arrays.toString(arr));







        }}
