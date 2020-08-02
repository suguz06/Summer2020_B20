package day17_String_continue;

import java.util.Scanner;

public class Separate_3_Words {

    public static void main(String[] args) {

        //input 3 words message++>> separetly write all 3-words


        Scanner scan=new Scanner(System.in);
        System.out.println(" enter  3 words message ");
        String mess=scan.nextLine();
        String word1=mess.substring(0, mess.indexOf(" "));
        String word2=mess.substring(mess.indexOf(" "), mess.lastIndexOf(" "));

        String word3=mess.substring(mess.lastIndexOf(" "));
        System.out.println("First word is: "+ word1+ ", " + " second word is " + word2+ ",  "+ " third word is "+ word3  );


    }
}
