package day13;

import java.util.Scanner;

public class nextline_VS_nextmethods {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary= scan.nextDouble();

        scan.nextLine(); //scan.nextLine();
        System.out.println("Enter your full name: ");
        String fullName=scan.nextLine();

        System.out.println("Salary is "+ salary);
        System.out.println("full name: "+ fullName);

    }

}
