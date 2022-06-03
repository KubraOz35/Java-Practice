package replitExcercises;

import java.util.Arrays;

public class CheckArray {
    public static void main(String[] args) {
        int a[]={10,-8,20,-40,32};
        int num=10;


        for (int w:a){
            if (w==num){
                System.out.println("num exist in this array");
                break;
            }else{
                System.out.println("does not exist ");
            }
        }

        //2.way

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int idx=Arrays.binarySearch(a,num);

        System.out.println( idx>=0 ? "exist" : "not exist");




    }
}
