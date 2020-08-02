package day23_Array;

import java.util.Scanner;

/*
write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculats the total price
            and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
            HINT: nested loop task, outter loop need to be an infinite loop

 */
public class RoomArrangeHotel {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int kingBed = 120;
        int queenBed = 100;
        int singleBed = 80;
        int price = 0;

        while (true) {

            for (int i = 1; i <= 1; i++) {
                System.out.println("enter your room type");
                String room = scan.next();
                if (room.equalsIgnoreCase("King")) {
                    price += kingBed;
                } else if (room.equalsIgnoreCase("queen")) {
                    price += queenBed;

                } else if (room.equalsIgnoreCase("single")) {
                    price += singleBed;
                }
            }

            int k=1;
            while (  k<4) {
                System.out.println("Do want another rezervation: yes or no");
                String rez = scan.next();
                if (rez.equalsIgnoreCase("yes")) {
                    System.out.println("total price " + price);
               break; } else if (rez.equalsIgnoreCase("no")) {
                    System.out.println("total price " + price);
                    System.exit(0);
                } else {
                    System.out.println("Please re-enter");
                } k++;
            }


        }
    }
}
