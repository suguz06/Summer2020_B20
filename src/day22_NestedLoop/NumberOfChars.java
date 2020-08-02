package day22_NestedLoop;


import java.util.Scanner;

/*
2.  Write a program that can asks user to enter
one string and one char and then returns the frequency of
str2 in str1

ExInput: AABAACA
Output: 4
Input: ABCCC
Output: 2
 */
public class NumberOfChars {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String word=scan.nextLine();


        String ch=scan.next().charAt(0)+"";

        int counter=0;
        for(int i=0; i<=word.length()-1; ++i) {

            if((word.charAt(i)+"").equals(ch)  ) { counter++;}

        }
        System.out.println(counter);
    }
}
