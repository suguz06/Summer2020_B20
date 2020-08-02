package day20_While;

import java.util.Scanner;

public class Reverse_While {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("enter a word: ");
        String word=scan.nextLine();

        int i= word.length()-1;
        String reverse="";
        while(i>=0){
            reverse +=word.charAt(i);
            --i;
        }
        System.out.println(reverse);
    }
}
