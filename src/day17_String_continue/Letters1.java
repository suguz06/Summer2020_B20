package day17_String_continue;

import java.util.Scanner;

/*
3. Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight

 */
public class Letters1 {
    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first word: ");
        String word1=scan.next();
        System.out.println("Enter second word: ");
        String word2=scan.next();

        if(word1.charAt(word1.length()-1)==word2.charAt(0)) {
            System.out.println(word1+word2.substring(1));
        }
        else {
            System.out.println(word1+word2);
        }



    }
}
