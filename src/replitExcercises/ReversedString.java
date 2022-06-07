package replitExcercises;

import java.util.*;

public class ReversedString {
    public static void main(String[] args) {

         //1st Way:
        String name="Coding is greate.";

        String nameArray [] = name.split("");

        System.out.println(Arrays.toString(nameArray));//[C, o, d, i, n, g,  , i, s,  , g, r, e, a, t, e, .]

        for (int i = nameArray.length-1; i >=0 ; i--) {
            System.out.print(nameArray[i]);
        }




//****************2.Way******************


        String str = "I wanna move to Bc";
        StringBuilder stb=new StringBuilder(str);

        stb.reverse();
        System.out.println(stb);

        //#####  3rd Way  ##################





        String srr="I love to write code";
        String reversed="";
        for (int i=srr.length()-1; i>-1 ; i--){
        reversed+=srr.charAt(i);
        }
        System.out.println(reversed);



    }


}





