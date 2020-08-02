package day13;

import java.util.Scanner;

public class warmup_7 {

    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        String report;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1 and its price:");
        String item1 = scan.next();
        double price1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        String item2 = scan.next();
        double price2 = scan.nextDouble();

        System.out.println("Enter Item3 and its price:");
        String item3 = scan.next();
        double price3 = scan.nextDouble();

        report = "Item1: " + item1 + " " + "Price: " + price1 + ", " + "Item2: " + item2 + " " + "Price: " + price2 + ", " +
                "Item3: " + item3 + " " + "Price: " + price3;
        double totalPrice = (price3 + price2 + price1);
        System.out.println(report);
        System.out.println("Total price: " + totalPrice);
    }
}