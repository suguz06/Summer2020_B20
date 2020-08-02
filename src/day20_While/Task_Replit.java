package day20_While;

import java.util.Scanner;

public class Task_Replit {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter e-mail: ");
        String email = scan.next();
        System.out.println("First name: " + email.substring(0, 1).toUpperCase() + email.substring(1, email.indexOf("_")));
        System.out.println("Last name: " + email.substring(email.indexOf("_") + 1, email.indexOf("_") + 2) + email.substring(email.indexOf("_") + 2, email.indexOf("@")));
        System.out.println("Domain: " + email.substring(email.indexOf("@") + 1, email.indexOf(".")));
        System.out.println("Top-Level Domain: " + email.substring(email.indexOf(".") + 1));
        System.out.println();
    }
}
