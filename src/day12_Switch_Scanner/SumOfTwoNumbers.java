package day12_Switch_Scanner;


import java.util.Scanner;

public class SumOfTwoNumbers {


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println(" enter your first number: ");
        int a=sc.nextInt();
        System.out.println(" enter second number: ");
        int b=sc.nextInt();

        System.out.println("summation of two numbers= "+ (a+b));

    }
}
