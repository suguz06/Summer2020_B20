package day21_DoWhile;


import java.util.Scanner;

/*
Warmup tasks:
    1. write a program that asks user to enter 5 numbers and retuns the maximum number
    2. write a program that asks user to enter 5 numbers and returns the minimum number
    3. write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                0utput: 3 with a remainder of 1
 */
public class WarmUp {

    public static void main(String[] args) {

        //1. write a program that asks user to enter 5 numbers and retuns the maximum number

        Scanner scan=new Scanner(System.in);
        int max=-2147483647;
        int min=2147483647;
        for (int i=1; i<=5; ++i) {
            System.out.println("Enter a number");
            int num=scan.nextInt();

            if ( num>=max ) max = num;
            if(num <= min) min=num;


        }
        System.out.println("maximum "+ max);
        System.out.println("minumum "+ min);

    }
}
