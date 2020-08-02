package day13;

import java.util.Scanner;
 /*
     1. write a java program that can convert any given numbers between 0 ~ 9 to words,
     if the number is greater than 9 or less than zero, out put should be "Invalid".
            MUST use Scanner and nested IF

  */
public class warmup_1 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");

        int number= scan.nextInt();

        if (number>=0 && number<=9){
            System.out.println("you give the "+ number);
        }else {
            System.out.println("invalid");
        }

    }
}
