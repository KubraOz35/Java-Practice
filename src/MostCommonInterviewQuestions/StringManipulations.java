package MostCommonInterviewQuestions;

public class StringManipulations {
    public static void main(String[] args) {

        //Find sum of the digits of given integer
        int x = 12356;

        int sumOfDigits = 0;

        for (int i = x; i > 0; i = i / 10) {
            sumOfDigits = sumOfDigits + i % 10;
        }
        System.out.print(sumOfDigits);//17


        //Write a method which accepts a String as parameter and prints the sum of the digits, present in the given string

        String str = "ade1r4d3";

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {

                sum += Integer.valueOf("" + str.charAt(i));
            }
        }
        System.out.println("sum is :" + sum);

        //2.way

        int summ = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                summ += Integer.valueOf("" + str.charAt(i));

            }
        }  System.out.print(summ);

    }}