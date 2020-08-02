package day23_Array;

import java.util.Scanner;

public class HotelPrice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;
        System.out.println("Welcome to Cybertek Inn");


         while (true) {
             System.out.println("Please choose from the following ");
             System.out.println("1. King bed: $120");
             System.out.println("2. Queen bed: $100");
             System.out.println("3. Single bed: $80");

             int option = scan.nextInt();

             switch (option) {
                 case 1:
                     total += 120;
                     break;
                 case 2:
                     total += 100;
                     break;
                 case 3:
                     total += 80;
                     break;
                 default:
                     System.out.println("there is no this type of room");
                     System.exit(0);

             }


             System.out.println("do u want to reserve another room: ");
             String a=scan.next().toLowerCase();

             while(! (a.equals("yes")|| a.equals("no")) ) {
                 System.out.println("invalid answer, please re-enter yes or no: ");
                 System.out.println("do u want to reserve another room: ");
                 a=scan.next().toLowerCase();
             }

             if(a.equals("no")) {break;}



         }
        System.out.println("total price: $"+ total);




    }
}
