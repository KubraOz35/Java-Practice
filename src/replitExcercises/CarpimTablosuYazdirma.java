package replitExcercises;

public class CarpimTablosuYazdirma {
    public static void main(String[] args) {
        //There is 2 different question.One of them print multiplication table with "carpim tablosu"method,second one "basiccalculator"method for showing the result of it.SAME MAIN METHOD

        carpimTablosu(8);
        carpimTablosu(9);

        System.out.println(basicCalculator(12,"+", 5));
        System.out.println(basicCalculator(12,"/",3));
        System.out.println(basicCalculator(12,"/",0));

    }

     public static void carpimTablosu(int a){


        int carpan = 1;
        while (carpan < 13) {
            System.out.println(a + "*" + carpan + "= " + a * carpan);
            carpan++;
        }

    }

        public static Object basicCalculator(int a, String o, int b) {
            if(o == "+") return a + b;
            if(o == "-") return a - b;
            if(o == "/" && (a != 0 && b != 0)) return a / b;
            if(o == "/" && (a == 0 || b == 0)) return null;
            if(o == "*") return a * b;
            if(o != "*" && o != "/" && o != "+" && o != "-") return null;
            return null;




    }

}