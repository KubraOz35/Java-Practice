package replitExcercises;

public class SumOfDigits {
    public static void main(String[] args) {



        String str="Ali2010veli2022";


int sum=0;
        for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i)>='0'&&str.charAt(i)<='9'){
               sum+=Integer.valueOf(""+str.charAt(i));
           }
        }System.out.println(sum);

////////////////////////////////////////
        int n= 753;
        int sumOfDigits= 0;

        for ( int i =n ; i>0  ;  i=i/10) {
            sumOfDigits = sumOfDigits + i % 10;
        }
        System.out.println(sumOfDigits);
    }
}
