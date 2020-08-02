package day16_String;

import java.util.Scanner;

/*
2. ask the user to enter a word.
        if the word ends with "ly", print "really???"
        otherwise, print "never mind"

 */
public class New_Practices {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scan.nextLine();

        String result = word.endsWith("ly") ? "really???" : "never mind";

        System.out.println(result);

    }
}
