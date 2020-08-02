package day16_String;
/*
 3. write a program that can check if the given gmail address is valid gmail account or not
        NOTE: a valid gmail account ends with @gmail.com
 */

import java.util.Scanner;

public class Equal_Words {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String firstWord = scan.next();
        System.out.println("Enter second word: ");
        String secondWord = scan.next();

//Method 1: if-else
          if (firstWord.equals(secondWord) ) {
            System.out.println("they are equal");
        }else {
            System.out.println("not equal");
        }
//Method 2: Ternary ==>> note that strings compares equality (== NOT)
// just equals() or equalsIgnoreCase() methods
        String result=firstWord.equals(secondWord)? "they are equal":"not equal";
        System.out.println(result);
    }
}
