package day15_String_Class;

import java.util.Scanner;

/*
asks the users enter first name and last name
takes first letters of them
 */
public class Practices {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("enter your first name: ");

        String firstName=scan.next();
        System.out.println("enter your last name: ");

        String lastName=scan.next();

        char ch1=firstName.charAt(0);
        char ch2=lastName.charAt(0);
// CharAt(index)  gives the chracter at index number+>>returns char
        System.out.println(firstName.charAt(0)+ "\n"+ lastName.charAt(0));
        System.out.println( ch1 + ""+ ch2 );
        System.out.println("Your initials: "+ ch1+ "."+ch2+".");

   //length() : returs an integer gives total number of characters

   String str="Cybertek12--0== ";
   int len= str.length();

        System.out.println(len);
    }
}
