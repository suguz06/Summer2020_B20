package day24_Array;

import java.util.Scanner;

/*
5. Write a program that will take five Strings and
save them into an array called arr. and  Use for loop to
 print out the first three letter of each element of arr, one per line.
            You can assume that every element of arr
            is at least 3 letters long.
                Example: arr -> ["apple", "banana"]
                        prints:  appban
 */
public class ThreeLettersOfStringsArrays {

    public static void main(String[] args) {

        String [] arr=new String[5];

        Scanner scan=new Scanner(System.in);
        System.out.println("enter five strings at least 3 chars ");
        String result="";
        for(int i=0; i<=4; ++i) {
            arr[i]=scan.next();
            result +=arr[i].substring(0, 3);

        }
        System.out.println(result);




    }

}
