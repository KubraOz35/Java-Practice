package replitExcercises;

public class ArraySum {
    public static void main(String[] args) {


   /* Write a method that accepts an array as parameter and returns sum and product off all elements in the array
    Then print the result in the main method.
    input : {1,2,3,4,5,6,7,8};

    output: 36*/
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        add(arr);
        product(arr);
    }

    public static void add(int a[]) {

        int sum = 0;
        for (int w : a
        ) {
            sum += w;

        }
        System.out.println(sum);

    }
     public static void product(int b[]){

        int product = 1;
        for (int i : b) {
            product *= i;
        }
        System.out.println(product);

    }}