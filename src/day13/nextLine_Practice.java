package day13;

import java.util.Scanner;

public class nextLine_Practice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter you building number: ");
        int buildingNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("enter your street name: ");
        String streetName = scan.nextLine();

        System.out.println("Building number: " + buildingNumber);
        System.out.println("street name: " + streetName);

        scan.close();

    }
}
