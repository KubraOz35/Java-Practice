package practice02Repeated;

public class Q06 {
    public static void main(String[] args) {
        /*
            Print on the console numbers from 1 to 100.
            But do not use any number in your code!
 */

        int n='a'/'a';   // a ASCII value is 97 :  97/97==>1
        int m='d';       // d ASCII value is 100

       while(n<=m){
           System.out.print(n+" ");
           n++;          //  <<===if you forget this part ,you will get infinitive 1
       }


    }
}
