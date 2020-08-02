package day16_String;

import java.util.Scanner;

public class words_3_char {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE
        int a=word1.length();
        int b=word2.length();
        String result="";
        if(a==3&&b==3) {
            for(int i=0; i<3; i++) {
                result +=word1.charAt(i)+""+word2.charAt(i);
            }
            //System.out.println(word1.charAt(0)+""+word2.charAt(0)+ ""+word1.charAt(1)
              //      +""+word2.charAt(1)+ ""+word1.charAt(2)+""+word2.charAt(2));
        }else {System.out.println("cannot merge"); }

        System.out.println(result);
    }
}
