package day12_Switch_Scanner;

import java.util.Scanner;

public class Hourly_Rate {


    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("enter your annual salary");
        double salary=sc.nextDouble();
        System.out.println("enter your tax rate: ");
        double taxRate= sc.nextDouble();
        System.out.println("enter how many hours per week: ");
        int hoursWeek=sc.nextInt();


        double rate= (salary-salary*taxRate)/(hoursWeek*52);
        System.out.println("hour rate is: "+ rate);

    }



}

