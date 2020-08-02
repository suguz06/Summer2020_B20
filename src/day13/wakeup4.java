package day13;

import java.util.Scanner;
/*
 Write a program that asks user to enter the month number and
 returns the number of days in given month month (Assume that Feb has 28 days)
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12

                MUST use Scanner and nested IF
 */
public class wakeup4 {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter a month number: ");

        int monthNumber=scan.nextInt();

        if(monthNumber>=0 && monthNumber<=12) {
            if(monthNumber==2) {
                System.out.println("28 day");
            }
            else if (monthNumber==4 || monthNumber==6 || monthNumber==9|| monthNumber==11)
            {
                System.out.println("30 days");
            } else {
                System.out.println("31 days");
            }
        }
        else{
            System.out.println("invalid month number");
        }



    }
}
