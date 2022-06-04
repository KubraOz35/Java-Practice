package replitExcercises;




public class ConvertInt {

    public static void main(String[]args) {
    //Convert a double data to int

        double x=2.58;
        int y=(int)x;
        System.out.println(y);//this is type casting

        double d = 15.89;
        System.out.println(toInteger(d));
        System.out.println(toIntegerWithRounding(d));

    }

    public static int toInteger(double num) {  //this is converting to string then find index of . ,and print till this index
        String s = Double.toString(num);
        int idx = s.indexOf(".");
        int result = Integer.valueOf(s.substring(0, idx));
        return result;
    }

    public static long toIntegerWithRounding(double num) {//this is solved by round method
        long result = Math.round(num);
        return result;
    }

    }