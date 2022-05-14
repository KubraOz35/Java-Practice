package Practice_extra;

import java.util.Arrays;

public class Q01 {
    public static void main(String[] args) {

        int a = 11;
        int b = 15;

        int result = (a<10) ? (a++) : (b++);


        System.out.println(result + "," + a + "," + b);


    }
}
