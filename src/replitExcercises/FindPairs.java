package replitExcercises;

public class FindPairs {
    public static void main(String[] args) {

/*
      Create a method and
     from a given array find all pairs whose sum is a given number,//at the task=we are looking for 2 number whose sum is equal to 10
     {4,6,5,-10,8,5,20} ===> 10
     4 + 6 = 10
     5 + 5 = 10
     -10 + 20 = 10
*/

        int array[] = {4, 6, 5, -10, 8, 5, 20};
        findPairs(array,10);//NUM=10 degistirip 11,12.. dene yeni kombinasyonlar gorecegiz after run

    }

    //ATTENTION !!!ana methodun disinda methodumuzu olusturuyoruz:

    public static void findPairs(int arr[],int num) {

        for (int i = 0; i < arr.length; i++) {          //first for-loop for my first element arr[i]

            for (int j = i + 1; j < arr.length; j++) {  // my second element  arr [j]//if doesnt start with 0:birinci sayi index 0 yani ilk rakamla basliyor,
                // ikinci elementin tekrar ilksayidan baslamasina gerek yok brinciden baslayacak
                if (arr[i] + arr[j] == num) {  // 10 a tamamlamak icin gerekli sayiyi bulacak,burada num yerine 10 da kullanabilirdik

                    System.out.println(arr[i] + " + " + arr[j] + " = " + num);
                }
            }
        }


    }}
