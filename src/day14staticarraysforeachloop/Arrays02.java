package day14staticarraysforeachloop;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //Create a String array and print the elements in alphabetical order on  the console in different lines
        //1.Step: Create a String array
        String myStringArray[] = new String[4];//[null, null , null, null]
        System.out.println(Arrays.toString(myStringArray));//[null, null , null, null]

        //Add elements into the array
        myStringArray[0]="veli";
        myStringArray[1]="can";
        myStringArray[2]="beyhan";
        myStringArray[3]="ali";
        System.out.println(Arrays.toString(myStringArray));//[veli, can, beyhan, ali]

        //How to put the elements in alphabetical order
        Arrays.sort(myStringArray);
        System.out.println(Arrays.toString(myStringArray));//[ali, beyhan, can, veli]

        //How to print the elements in different lines
        for (String w: myStringArray){
            System.out.println(w);
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@");
        //Print the List elements if the number of character is less than 4.[ali, beyhan, can, veli]
        for(String w : myStringArray){
            if (w.length()<4){//sadece 4 harften az olusanlari yazdir kosulu verdik o yuzden beyhan ve veli i eledi
                System.out.println(w);//[ali, can]
            }
        }
        System.out.println("***************************");

        //Print the List elements if you see "can"stop printing////[ali, beyhan, can, veli]

        for(String w : myStringArray){
            if (w.equals("can")){//w degeri can a esitse dur baska yazdirma dedik
                break;
            }
            System.out.println(w);//[ali, beyhan]
        }
        System.out.println("-----------------------------");

        //Print the List elements except "can"if there is
        //1.Way:

        for(String w : myStringArray){
            if (!w.equals("can")){//w degeri can a esitse yazdirma atla dedik
                System.out.println(w);

            }
        }
        //2.Way:
        for(String w : myStringArray){
            if (w.equals("can")){
                continue;//it s a keyword to  skip some elements inside the paranthesis
            }
        }

    }
}
