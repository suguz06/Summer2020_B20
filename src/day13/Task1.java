package day13;

/*

. Write a program that calculates the sum of
numbers entered by the user until user enters a negative number.
 */


import java.util.Scanner;

public class Task1 {
    public static void main (String [] args){
        int number = 0;
        int counter = 0;
        int sum = 0;

        // prompt the user
        String promptMsg = "Enter an integer (negative to quit): ";
        System.out.println(promptMsg);

        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        while (number >= 0) {
            counter++;
            sum += number;

            // prompt the user to enter the next input
            System.out.println(promptMsg);
            number = sc.nextInt();
        }

        // defer computing average until here
        double average = sum / counter;
        System.out.println("this is the average:" + average+ " sum is: "+sum);

        // close up when done
      //  sc.close();
    }


    }


