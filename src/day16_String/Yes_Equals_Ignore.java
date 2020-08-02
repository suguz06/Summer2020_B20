package day16_String;

import java.util.Scanner;

public class Yes_Equals_Ignore {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Are you employeed? ");
        String answer=scan.next();
         //   String answer1=scan.next().toLowerCase(); is works also for equals()

        if(answer.equalsIgnoreCase("yes")) {
            System.out.println("employeed");
        }
        else{
            System.out.println("not employeed");
        }
    }
}
