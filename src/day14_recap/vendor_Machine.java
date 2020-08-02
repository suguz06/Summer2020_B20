package day14_recap;

import java.util.Scanner;

public class vendor_Machine {

    public static void main(String[] args) {


        int itemPrice, quarters, dimes, nickels;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter price in cents:");
        itemPrice=scan.nextInt();
        quarters=(100- itemPrice) /25;
        dimes=(100- itemPrice- quarters*25) /10;
        nickels=(100- itemPrice-quarters*25-dimes*10) /5;

        if (itemPrice %5==0) {
            if(itemPrice>=25 && itemPrice <=100)
            {System.out.println("Your change is "+ quarters+ " quarters, "+ dimes+
                    " dimes, and "+ nickels+ " nickels."    );}
            else {System.out.println("Invalid price!");}
        }
        else {  System.out.println("Invalid price!");}

    }
}
