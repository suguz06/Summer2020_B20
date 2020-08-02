package day12_Switch_Scanner;

import java.util.Scanner;

public class Scanner_prac {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("enter a number:  " );

        double num= sc.nextDouble();

        String result= num%2==0? num +" is even": num+ "  is odd";

        System.out.println(result );

    }
}
