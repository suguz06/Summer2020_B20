package day15_String_Class;

import java.util.Scanner;

public class Even_Odd_Middle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word: ");
        String word = scan.next();
        //YOUR CODE HERE
        int a = word.length();
        if (a == 1) {
            System.out.println(word + "" + word + "" + word);
        }
        if (a % 2 == 1) {
              if (a >= 3) {
                System.out.println(word.substring(a / 2, a / 2 + 1));
            }
        } else if (a % 2 == 0) {
            if (a >= 4) {
                System.out.println(word.substring(a / 2 - 1, a / 2 + 1));
            } else if (a == 2) {
                System.out.println(word + "" + word);
            }
        }

    }
}
