package day16_String;

import java.util.Scanner;

/*
 1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana



  */
public class Substring_Practice {

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("enter your first word: ");

        String s1=scan.next();
        System.out.println("enter your second  word: ");
        String s2=scan.next();

        String result= s1.substring(1)+s2.substring(1);
        String r=s1.substring(1).concat(s2.substring(1));

        System.out.println(result);
        System.out.println(r);

    }
}
