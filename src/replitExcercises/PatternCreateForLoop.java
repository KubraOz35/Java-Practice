package replitExcercises;

public class PatternCreateForLoop {
    public static void main(String[] args) {

        int i=8;
        int j=8;
        int row=8;

        for (i = 0; i < row; i++) {
            for (j = row-i ; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }



        }
    }





