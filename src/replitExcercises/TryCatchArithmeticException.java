package replitExcercises;

public class TryCatchArithmeticException {
    public static void main(String[] args) {
        int a =20;
        int b=5;

        try{
            System.out.println("Result of division: "+ a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Its done");











    }
}
