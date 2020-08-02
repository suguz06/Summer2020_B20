package day23_Array;

import java.util.Scanner;

/*
Warmup tasks:
    1. write a program that ill ask user to enter two numbers and calculates the sum of those two numbers.
     then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the anser is not a valid answer (not yes or no), the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outter loop need to be an infinite loop

 */
public class Warmup1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        boolean yes = true;
        boolean no = false;

//
//        for (int i = 1; i <= 2; ) {
//
//            for (int k = 1; k <= 2; k++) {
//                System.out.println("enter number1");
//                int num1 = scan.nextInt();
//                System.out.println("enter number2");
//                int num2 = scan.nextInt();
//                sum += num1 + num2;}
//                System.out.println(" wants to continue: yes or no");
//                String ask = scan.next();
//
//                if (ask.equalsIgnoreCase("yes")) {
//                    System.out.println("sum= " + sum);
//                } else if (ask.equalsIgnoreCase("no")) {
//                    System.out.println("sum= " + sum);
//                    System.exit(0);
//                } else {
//                    System.out.println("invalid answer");
//                }
//            }
//        }


        for (int i = 1; i <= 2; ) {

        for (int k = 1; k <= 2; k++) {

            System.out.println("enter numbers");
            int num = scan.nextInt();
            sum += num;}
        System.out.println(" wants to continue: yes or no");
        String ask = scan.next();

        if (ask.equalsIgnoreCase("yes")) {
            System.out.println("sum= " + sum);
        } else if (ask.equalsIgnoreCase("no")) {
            System.out.println("sum= " + sum);
            System.exit(0);
        } else {
            System.out.println("invalid answer");
        }
    }
}


    }

