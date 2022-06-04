package replitExcercises;

public class FindPerfectNumber {
    public static void main(String[] args) {

        int no=7;

        int perfectNo=0;
        for(int i = 1 ; i < no ; i++) {
            if(no % i == 0)  {
                perfectNo+= i;
            }
        }
        if (perfectNo == no) {
            System.out.format( no +" is a Perfect Number");
        }
        else {
            System.out.format(no + " is NOT a Perfect Number");
        }
    }






    }

