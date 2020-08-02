package day16_String;

import java.util.Scanner;

public class Items_Gift_Card {


    public static void main(String[] args) {
        //WRITE YOUR CODE HERE
        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter want to buy: ");
        String item = scan.nextLine();


        switch (item) {

            case "Smartphone":     System.out.println("Sorry, not enough funds on your gift card!"); break;
            case "Hat": {     System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 75$"); } break;
            case "Laptop": {     System.out.println("Sorry, not enough funds on your gift card!"); } break;
            case "Charger": {     System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 85$"); }break;
            case "USB cable": {     System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 90$"); }break;
            case "Headphones": {     System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 70$"); }break;
            case "Pants": {     System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 50$"); }break;
            case "Socks": {     System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 95$"); }break;
            case "Blanket": {     System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 40$"); }break;
            case "Pillow": {     System.out.println("Thank you for your purchase!");
                System.out.println("Your current balance is: 60$"); }

        }

        boolean valid= item.equals("Hat")|| item.equals("Smartphone") ||
                item.equals("Laptop") ||  item.equals("Charger") ||  item.equalsIgnoreCase("USB cable") ||
                item.equals("Headphones") ||  item.equals("Pants") ||  item.equals("Socks")
                || item.equals("Blanket") ||  item.equals("Pillow");

        if(!valid) {     System.out.println("Invalid item!");}


    }
}
