package day23_Array;

import java.util.Scanner;

public class Freq_Char_WarmUp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word: ");
        String str1 = scan.next();


        String dupresult = "";
        String result = "";
        for (int i = 0; i <= str1.length() - 1; ++i) {
            if (!dupresult.contains("" + str1.charAt(i))) {
                dupresult += str1.charAt(i);
            }
        }


        for (int n = 0; n <= dupresult.length() - 1; ++n) {
            char ch=dupresult.charAt(n);
            int counter = 0;
            for (int k = 0; k <= str1.length() - 1; ++k) {


                if (str1.charAt(k) == ch) {
                    counter++;


                }
            } result += ""+ch+ " " +counter;
        }



        System.out.println(result);
    }
}