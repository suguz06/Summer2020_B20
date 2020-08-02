package day13;

import java.util.Scanner;

public class scanner_NextLine {

    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName= scan.nextLine();

        System.out.println("Enter your company name:");
        String companyName= scan.nextLine();

        System.out.println("Enter your full address:");
        String address= scan.nextLine();

        String fullAddress= fullName+ " "+ companyName+ " " + address;


        System.out.println(fullAddress);

    }


}
