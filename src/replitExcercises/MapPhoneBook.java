package replitExcercises;

import day11dowhileloop.PracticeHome;

import java.util.*;//bu sekilde butun interface ler import yapilmis oluyor tek tek gerek kalmiyor

public class MapPhoneBook {
    public static void main(String[] args) {


        Map<Integer,String> phoneBook= new TreeMap<>();

phoneBook.put(123456789," Kubra Ozyasar");
phoneBook.put(789456123,"Senai Ozyasar");
phoneBook.put(123654987,"Eyup ozturk");
phoneBook.put(963852711,"Yesim Ozturk");
phoneBook.put(456963852,"Esma Oz");

        System.out.println(phoneBook);




    }
}
