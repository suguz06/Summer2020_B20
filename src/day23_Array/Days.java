package day23_Array;

import java.util.Scanner;

public class Days {


    public static void main(String[] args) {

        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("enter a day number: ");
        int dayNum = scan.nextInt();

        System.out.println("Today is: " + days[dayNum - 1]);

            System.out.println("do u want again ask");
            String ans=scan.next();
            while(true) {
                if (!ans.equalsIgnoreCase("yes") &&
                ! ans.equalsIgnoreCase("no")) {
                    System.out.println("invalid answer, yes or no");
                  ans=scan.next();
                    if(ans.equalsIgnoreCase("Yes")) break;
                    if(ans.equalsIgnoreCase("no"))
                System.exit(0);
                }



            }
    }
    }
}
