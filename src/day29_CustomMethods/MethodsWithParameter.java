package day29_CustomMethods;

import day03_sequence_Variables.SalaryCalculator;

import java.util.Scanner;

public class MethodsWithParameter {

    public static void printHello(int numberOfTimes, int m) {

       for(int i=1; i<=numberOfTimes;++i) System.out.println("Hello World!");
        for(int i=1; i<=m;++i) System.out.println("How are you");
    }


    public static void main(String[] args) {
        printHello(2, 1);

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your birth year and current year: ");
        int birthyear=scan.nextInt();
        int currentYear=scan.nextInt();

        age(birthyear,currentYear);
    }

    /*
    give an age method note current year less than birthyear +>>gives bugs
     */

    public static void age(int birthYear, int currentYear) {
if(currentYear<birthYear) {
    System.out.println("invalid entry ");
}
      else  System.out.println("Age: "+ (currentYear-birthYear)+ " years old.");
    }

}
