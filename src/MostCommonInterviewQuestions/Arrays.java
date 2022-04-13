package MostCommonInterviewQuestions;

public class Arrays {
    public static void main(String[] args) {

        //Find the second largest element in an array

        int []arr = {2, 85, 7, 15, 12, 45, 39};
        java.util.Arrays.sort(arr);
        System.out.println(arr[arr.length - 2]);


        //How to find Max and Min an array?

        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println("min : " + min + " max :" + max);

        // How to find duplicate element in an array?

        int [] brr= {1, 3, 5, 9, 4, 6, 2, 1, 3, 5, 9, 10, 14, 12};

        for (int i = 0; i < brr.length; i++) {
            for (int j = i + 1; j < brr.length; j++) {

                if (brr[i] == (brr[j])) {
                    System.out.println(brr[j]);
                }
            }

            String str = "I will learn Java then i will write Java codes";
            String[] words = str.split(" ");

            for(int k = 0; k < words.length; k++) {
                for (int m = k + 1; m < words.length; m++) {
                    if (words[k].equals(words[m])) {
                        System.out.println(words[k]);

                    }
                }
            }

        //  When will we get ArrayStoreException?
            // It is a runtime exception. For example, we can store only string elements in a String Array.
            // If anybody tries to insert integer element in this String Array, then we will get ArrayStoreException at run time.

        // When ArrayIndexOutOfBoundsException occurs?
            // It is a run time exception.
            // It will occur when the program tries to access invalid index of an array. Index higher than the size of the array or negative index.

        //https://career.guru99.com/top-50-array-interview-questions-answers/





    }}}