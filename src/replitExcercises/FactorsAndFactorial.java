package replitExcercises;

public class FactorsAndFactorial {
    public static void main(String[] args) {

        int number=8;//It is the number to calculate factorial  and factors

        int factorial=1;

        for(int i=1;i<=number;i++){

            factorial*=i;
        }
        System.out.println("Factorial of "+ number+" is: "+factorial);//40320

        ////////////////////////////////////






        //Find Factors:

        for(int m=1; m <= number; m++) {

            if(number % m == 0)

                System.out.print(m+ " ");//1	2	4	8
        }
    }
}
