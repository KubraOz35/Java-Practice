package replitExcercises;

public class findAsciiValues {
    public static void main(String[] args) {

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println("Ascii value of " + i + " = " + (int) i); //The Ascii value of A is 65
            //  The Ascii value of B is 66
            //   The Ascii value of C is 67
        }

        System.out.println("****************************");
      /*  String value= "";
        for (int i = 'a'; i <'z' ; i++) {
            System.out.println("Ascii value of:"+ i + value);//Ascii value of:97
Ascii value of:98
Ascii value of:99
Ascii value of:100//int yazdigimiz isin karakteri ilerletmiyor,yanlis olani gostermek icin bunu burada tutyorum*/


        char ch;

        for (int i = 'a'; i <= 'z'; i++) {

            for (ch = 'a'; ch <= 'z'; ch++) {

                System.out.println("Ascii value of " + ch + "=" + i);

            }
        }


    }}


