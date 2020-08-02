package day20_While;

import java.util.Scanner;

public class WhileLoop_Practices {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String password = "Cybertek123";

        System.out.println("Enter your password: ");
        String input = scan.nextLine();
        int counter = 1;
        while (!input.equals(password)) {
            System.out.println("invalid, pls re-enter: ");
            input = scan.nextLine();
            counter++;
//            if (counter == 4) {
//                System.out.println("account protected");
//                System.exit(0);
            //}
        }
            System.out.println("logged in");

        }


    }

