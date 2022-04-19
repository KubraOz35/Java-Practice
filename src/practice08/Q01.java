package practice08;

import java.util.*;

public class Q01 {
    public static void main(String[] args) {


  /*  Create a list by getting the list elements from user
    If there is duplicated elements remove them from the list(you can use sets)
    Note: Give a message to the user as "Enter list elements, to stop entrance press '*'"

    1-get elements from user
    2-create a list
    3-add elements to list until user enter *
    4-create an empty string
    5-while loop

    6-check duplicate

            */
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string");
        List<String> list = new ArrayList<>();

        String str = "";

        while (!str.equals("*")) {
            str = scan.next();
            if (!str.equals("*")) {
                list.add(str);
            }
        }
        System.out.println(list);

//If they ask you to remove duplicated elements you can use sets
        Set<String> set=new HashSet<>(list);
        System.out.println(set);
    }
    }
