package day20practiceinterview;

public class Q05 {
    public static void main(String[] args) {

        String str = "M ";

        str = str.concat("E ");

        String add = "S ";

        str = str.concat(add);

        str.replace("S", "T");

        str = str.concat(add);

        System.out.println(str);
    }
}
