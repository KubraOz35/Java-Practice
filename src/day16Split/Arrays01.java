package day16Split;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Put each word to an array as an element
        String words= "I go to school";//java boslugu gordugunde onu kaldirir ve elementi parcalara  boler
        String array[] = words.split(" ");
        System.out.println(Arrays.toString(array));


        String name="Sevval#Mustafa#Suat#Fatmanur";
        String name2[]=name.split("#");
        System.out.println(Arrays.toString(name2));//[Sevval, Mustafa, Suat, Fatmanur]


        String str ="Learn Java earn money";
        String str2[]=str.split(" ");
        System.out.println(Arrays.toString(str2));

        //I go to school and I talk to friends and I talk to teachers
        //Please separate each sentence from "and" put them in an array.

        String sentence="I go to school and I talk to friends and I talk to teachers";
        String newSentence[]=sentence.split("and");
        System.out.println(Arrays.toString(newSentence));






    }
}
