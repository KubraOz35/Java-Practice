package practice05;
public class Q07 {
    public static void main(String[] args) {
        //Write a code that adds given integers except the first one
        // and multiplies with the first integer.
        method(1,2,3,4,5,6);//20
        method(8,1);//8                          // elementleri ana methodun icinden alacagiz
        method(5,1,2,3,4,5);//75
    }



    public static void method(int first, int... numbers){//once ana methodun disina yeni method yazarak basliyoruz,
                                                       //ilk sayiyi ayri tutmak icin int first, yaptik sonra varrargs kullandik
        int sum = 0;//  // basit toplama loop umuzu yapiyoruz
        for(int each : numbers){
            sum = sum + each;
        }
        int result = first * sum;//toplami ilk deger ile carpiyoruz
        System.out.println(result);
    }
}








