package day21_DoWhile;


import java.util.Scanner;

/*
 3. write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                0utput: 3 with a remainder of 1
 */
public class WarmUp2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a=scan.nextInt();
        System.out.println("Enter 2nd number");
        int b=scan.nextInt();

        int count=0;
        while (b<=a) {
            a=a-b;
            count++;
        }
        System.out.println("count is "+ count + " remainder is "+ a);





    }
}
