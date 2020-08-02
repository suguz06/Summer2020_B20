package day22_NestedLoop;


import java.util.Scanner;

/*
1.  Write a program that asks user to enter a string. If string started with uppercase and ends with lowercase
letter then print true, otherwise print false

Ex:Input: Cybertek output: true

Input: CyberteK output: false
 */
public class FirstLetter_LastLetter {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();

        if(word.charAt(0)>=65 && word.charAt(0)<=90 // or if(word.charAt(0)>='A' && word.charAt(0)<= 'Z'
                &&word.charAt(word.length()-1)>=97 && word.charAt(word.length()-1)<=122  ) { // word.charAt(word.length()-1)>='a' && word.charAt(word.length()-1)<='z'
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
