package replitExcercises;

import java.util.Scanner;

public class MaxOccuring {
    public static void main(String[] args) {

/*Write a Java program to get a String from user as input and find the maximum occurring character in that string. (Ignore case sensitivity)

        input :Learning java is easy

        output:maximum occurring character is : a*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String array[] = scan.nextLine().trim().replaceAll("\\p{P}", "").split("");

        String mostRepeatedLetter = "";

        int counter = 0;
        int maxCounter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equalsIgnoreCase(array[j])) {
                    counter++;
                }
            }
            if (counter > maxCounter) {
                maxCounter = counter;
                mostRepeatedLetter = array[i];
            } else if (counter == maxCounter) {
                mostRepeatedLetter += ", " + array[i];
            }
            counter = 0;
        }
        System.out.println(" Most repeated letter is : " + mostRepeatedLetter);
    }
}