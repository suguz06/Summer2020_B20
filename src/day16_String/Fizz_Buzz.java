package day16_String;

import java.util.Scanner;

public class Fizz_Buzz {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("enter first word: ");
               String word1=scan.nextLine();
        System.out.println("enter second word: ");
        String word2=scan.nextLine();
               int a=word1.length();
               int b=word2.length();

               // word1.endsWith(""+word2.charAt(0)) &&
        // word2.startsWith(""+word2.charAt(word1.length()-1));
     Boolean aa=  word1.charAt(a-1)==word2.charAt(0);
       if(a==5&&b==5) {
           if(aa) {
               System.out.println("fizz");
           }
           else   {
               System.out.println( "buzz");
           }

       }else {
           System.out.println("need to be 5 chars");
       }

    }
}
