package replitExcercises;

import java.util.Scanner;

public class EbobEkokFind {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two number");

        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        System.out.println(Ebob(sayi1,sayi2));

        System.out.println(Ekok(sayi1,sayi2));

    }

    public static int Ebob(int sayi1, int sayi2) {

        int ebob = 1;

        for (int i = 2; i <= sayi1 && i <= sayi2; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }
        return ebob;

    }
    public static int Ekok(int sayi1, int sayi2) {

        int ebob= Ebob(sayi1,sayi2);
        int ekok = (sayi1 * sayi2) / ebob;
        return ekok;


    }}

