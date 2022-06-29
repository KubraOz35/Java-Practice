package day12constructorsmethodoverloading;

public class PracticeCalculater {
    public static void main(String[] args) {

        int x = 3;
        int y = 5;

        System.out.println(calculator(5,"*",4));

    }

    public static Object calculator(int a, String o, int b) {


        if (o == "+") return a + b;
        if (o == "-") return a - b;
        if (o == "*") return a * b;
        if (o == "/" && (a != 0 && b != 0)) return a / b;
        if (o == "/" && (a == 0 || b == 0)) return null;
        if (o != "*" && o != "/" && o != "+" && o != "-") return null;

        return null;
    }
}







