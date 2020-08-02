package day19_For_Loop;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter a word or sentence; ");
            String str = scan.nextLine();
            int indexNum = str.length();

            String result = "";

            for (int i = indexNum - 1; i >= 0; --i) {
                result += str.charAt(i);
            }

            //System.out.println(result);

            if (result.equals(str)) {
                System.out.println("palindrome");
            } else {
                System.out.println("not palindrome, try again");
            }

            System.out.println("enter your y/n");
            String answer = scan.next();
            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("try again");
            } else if (answer.equalsIgnoreCase("no"))
            {
                System.out.println("thanks u");
                System.exit(0);
            } else{
                System.out.println("pls enter valid answer");
            }


        }


    }
}
