package replitExcercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
       /* Write a program that accepts an integer as input and prints first 10 prime numbers greater than input Check numbers
        if they are even or not in a return method.

                Input : 5
                 Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]


        Scanner scan = new Scanner(System.in);//bu cozum yanlis ,sadece odd sayilari yazdiriyor
        System.out.println("Please enter a number");
        int number = scan.nextInt();

        List<Integer> list = new ArrayList<>(number);

        int counter = 0;
        while (counter < 10) {
            if ((number % 2 != 0 && number % number == 0)) {
                counter++;
                list.add(number);
            }
            number++;

        }

        System.out.println(list);*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int  num= scan.nextInt();

        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {//2 den baslasin sayinin yarisina kadar tarasin o yuzden modulus degil / kullaniyoruz
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
           System.out.println(num + " is not a prime number.");

        /*Prime number döndüren kod bu.Mantığıda sayının kendisine kadar olan sayılarını böldüğünde tam bölünmemesi istenior. Sadece kendisine ve 1 e bölüncek.
        Zaten tüm sayma sayıları 1 e bölündüğünden onu kontrol etmiyoruz.2 den sonraki sayılar prime mı değilmi diye kontrol ediyoruz
        dolayısıyla 2 den başlıyoruz tek tek kontrol etmek istediğimiz sayıya kadar olan tüm sayıların yarısına kadar olan sayılara bölüyoruz.
         Neden yarısı ? Cünkü bir sayıyı onun yarısından 1 fazlasına böldüğünde kesirli bir sayı elde edersin ancak biz tam bölünebilen bir sayı arıyoruz
         Şimdi bir örnek yapalım diyelimki kontrol etmek istediğimiz sayı 23:

         23 /2 = 11.5 bunu yuvarlarsak 12
         2 den başlıyoz bir bir arttırarak 12 ye kadar olan sayılara tek tek 23 ü bölüyoruz
         23/2 = 11.5, 23/3 = 7.6, 23/4 = 5.75, 23/5 = 4.6, 23/6 = 3.83, 23/7 = 3.28 23/8 = 2.875, 23/9 = 2.55, 23/10 = 2.3, 23/11 = 2.09  (edited)
        Gördüğün üzere 23 sadece kendisine tam bölünüyor*/


    }
}







