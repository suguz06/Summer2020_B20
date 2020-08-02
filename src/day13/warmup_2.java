package day13;

import java.util.Scanner;

/*
write a program for the shipping info that, the program should ask:
                    building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102

 */
public class warmup_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your building number:  ");
        int buildingNumber = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your street address:  ");
        String streetAddress = scan.nextLine();

        System.out.println("Enter your city name:  ");
        String cityName = scan.next();

        System.out.println("Enter state name:  ");
        String stateName = scan.next();

        System.out.println("Enter zip code:  ");
        int zipCode = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your full name:  ");
        String fullName = scan.nextLine();

        System.out.println("Ship To: " + fullName + "\n" +  buildingNumber+ " "+ streetAddress + "\n" +
                cityName + ", " + stateName + " " + zipCode);

    }
}
