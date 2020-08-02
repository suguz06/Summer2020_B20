package day11_NestedIf;

import java.util.Scanner;

public class Prime_Or_Not {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        boolean flag = false;
        if (num > 1) {
            for (int i = 2; i <= num / 2; ++i) {
                // condition for nonprime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (flag)
                System.out.println(num + " is not a prime number.");
            else
                System.out.println(num + " is   a prime number.");
        } else System.out.println("invalid");
    }
}
