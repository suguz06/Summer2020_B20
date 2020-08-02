package day21_DoWhile;


import java.util.Scanner;

/*
write a program that can divide two numbers without using / & % operators and retuns the devision and remainder
            ex:
                input:  10
                        3
                0utput: 3 with a remainder of 1
 */
public class DivideTwoNumbers_IntQ {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a ");
        int a = scan.nextInt();

        System.out.println("Enter b ");
        int b = scan.nextInt();

        if (b == 0) {
            System.out.println("invalid input");
            System.exit(0);
        }

        int counter = 0;
        while (a >= b) {
            a -= b;
            counter++;
        }

        System.out.println("Remainder " + a + " Division " + counter);


    }
}
