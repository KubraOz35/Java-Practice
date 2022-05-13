package practice08;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
      /*
	 	Ebay Interview Question
	 	Create an array and get elements of array from user
	 	Put all zeros to end in an integer array
	 	{3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
	 	{0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
	 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of array..");
        int length = scan.nextInt();
        int array[] = new int[length];//array in uzunlugunu sorduk ve o kadar sayida bos array olusturduk
        System.out.println(Arrays.toString(array));//[0, 0, 0, 0, 0]


        System.out.println("Please enter the elements of array..");//elementleri sorduk ve tek tek bos arrayin icine aldik
        for (int i = 0; i < length; i++) {
            array[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(array));//[5, 4, 0, 2, 0]


        int brr[] = new int[length];//ayni uzunlukta yeni array olusturduk,sadce siralama degisecek o yuzden uzunluk degismiyor

        int idx = 0;
        for (int i = 0; i < length; i++) {
            if (array[i] != 0) {
                brr[idx] = array[i];//0 olmaya sayilari yazdiracak,kalan arrayin uzunlugu kadar da 0 ekleyerek ayni uzunluga ulasmis olacak
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));

    }
}