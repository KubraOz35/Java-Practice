package replitExcercises;

public class AverageValueArray {
    public static void main(String[] args) {
        //Write a java program that calculates the average value of array elements
        //
        //input[]= {1,2,3,4,5,6,7}
        //
        //Output : 4

        int [] arr={1,2,3,4,5,6,7};

        double average=1;
        int sum=0;

        for (int w:arr){
            sum+=w;

            average=sum/arr.length;
        }
        System.out.println(average);






    }
}
