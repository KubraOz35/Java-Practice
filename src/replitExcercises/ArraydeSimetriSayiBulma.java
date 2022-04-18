package replitExcercises;

public class ArraydeSimetriSayiBulma {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 4, 3, 2, 1};

        boolean simetri = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length - 1 - i]) {  //PAY ATTENTION HERE==>>arr.length-1-i
                simetri = true;
            } else {
                simetri = false;
            }
        }
        System.out.println(simetri);




    }
}


