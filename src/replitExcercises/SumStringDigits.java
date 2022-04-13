package replitExcercises;

public class SumStringDigits {
    public static void main(String[] args) {



      /*Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string
        input : ade1r4d3
        output : 8

   */

        String str = "ade1r4d3";

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {

                sum += Integer.valueOf("" + str.charAt(i));

            }

        }   System.out.println("sum is :"+sum);

        myMethod(str);//BURASI 2.way icin method call ilk soru ile alakasi yok!!! PAY ATTENTION
    }


    //2.Way:


            public static void myMethod(String a) {
                String b = a.replaceAll("\\D", "");
                int c = Integer.valueOf(b);
                int sum = 0;
                for (int i = c; i > 0; i = i / 10) {
                    sum += i % 10;
                }
        System.out.println(sum);
            }
/*    sumDigitInString("Ali1245sfg");
}

  / public static void sumDigitInString(String str) {

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum += Integer.valueOf("" + str.charAt(i));

            }
        }  System.out.print(sum);*/

    }

