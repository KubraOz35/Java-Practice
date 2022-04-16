package replitExcercises;

import java.util.Arrays;

public class RepeatedCharacterPrint {
    public static void main(String[] args) {


      String str = "Java is easy ";
        int cnt = 0;

        char[] repeated = str.toCharArray();
        System.out.println("Duplicate Characters are:");


        for (int i = 0 ; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {

                if (repeated[i] == repeated[j]) {
                    System.out.println(repeated[j]);
                    cnt++;
                    break;
                }
            }
        }
/*
        String s="Java is easy";

        String arr[]=s.replaceAll(" ","").split("");
        System.out.println(Arrays.toString(arr));//J, a, v, a, i, s, e, a, s, y]

        String ortak="";

        for (int i=0;i< arr.length;i++){

            for (int j=i+1; j<arr.length;j++){

                if (arr[i].equals(arr[j]) && !ortak.contains(arr[i])){
                    ortak+=arr[i]+"-"; //a s
                }
            }
        }
        String brr[]={ortak};
        System.out.println(Arrays.toString(brr));//arraye koydum ortak elementleri

*/



    }
}
