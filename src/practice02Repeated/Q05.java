package practice02Repeated;

public class Q05 {
    public static void main(String[] args) {
    /*
           Type a program to check if a positive number is perfect or not
            For example if the number is 6, we should see
            Perfect Number on the console.
            (The factors of 6 are : 1,2,3,6
            1+2+3=6  ==> it is perfect number )           */

        int num=6;                     //Firstly ;  find factors
        int sum=0;                     //Then  :    sum of factors
                                       //set up sum=number condition
        for ( int i=1; i<num ; i++ ){
            if (num%i == 0){       //find factors
                sum = sum + i;    //sum of factors
            }
        }

        if (sum==num){//sum=number condition
            System.out.println("It is a perfect number");
        }else{
            System.out.println("not a perfect number");
        }

























    }
}