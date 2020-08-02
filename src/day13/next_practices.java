package day13;

import java.util.Scanner;

public class next_practices {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first name:  ");
        String firstName = scan.next();
 scan.next(); scan.next();
        System.out.println("enter your middle name:  ");
        String middleName = scan.next();
        scan.next();
        System.out.println("enter your last name:  ");
        String lastName = scan.next();

        System.out.println("Your full name is: " + firstName + " " + middleName + " " + lastName);


    }
}