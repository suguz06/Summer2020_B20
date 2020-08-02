package day17_String_continue;

import java.util.Scanner;

/*
 2. Ask user to enter a word. If the first or second or both letter of the word is x, print the word without x(s). If x is the third letter it should be printed. If the first and second are x, both should be ignored.
                    Input:
                        xxode
                    Output:
                        ode
                    Input:
                        oxidex
                    Output:
                        oidex
 */
public class Letters {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=scan.next();

        if(word.substring(0, 2).contains("xx")) {
            System.out.println(word.substring(2));
        }
        else if(word.substring(0, 1).contains("x")) {
            System.out.println(word.substring(1));
        }
        else if (word.substring(1, 2).contains("x")) {
            System.out.println(word.charAt(0)+word.substring(2));
        }


    }
}
