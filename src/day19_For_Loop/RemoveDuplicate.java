package day19_For_Loop;

import java.util.Scanner;
/*

Duplicate remove==>>> input aaaaaaabbbbccc ==>> output==>> abc
 */
public class RemoveDuplicate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter a word: ");
        String word = scan.nextLine();

        String result = "";
        for (int i = 0; i <= word.length() - 1; ++i) {
            if (result.contains("" + word.charAt(i))) {
                continue;
            }
            /*
             if ( !result.contains("" + word.charAt(i))) {
                result += word.charAt(i);  //also work
            }
             */

            result += word.charAt(i);


        }

        System.out.println(result);


    }
}
