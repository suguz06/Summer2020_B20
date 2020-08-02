package day15_String_Class;

import java.util.Scanner;
//concat(string) ==>> string concat string only
public class Prac_3 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter first name: ");

        String firstName=scan.next();

        System.out.println("Enter last name: ");

        String lastName=scan.next();

        String fullName=firstName.concat(" ".concat(lastName));
        System.out.println(fullName);


    }
}
