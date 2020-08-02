package day12_Switch_Scanner;

/*
Scanner methods==>>> nextInt(): returns as int primitive

 */


import java.util.Scanner;

public class Scanner_Practices {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        int num = input.nextInt()+1;
        if (num % 2 == 0) {
            System.out.println("you entered even number: " + num);
        } else {
            System.out.println("you entered odd number: " + num);
        }

    }
}