package day24_Array;

/*
String Methods

1- toCharArray()  => returns char array

 */


import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String st="ABCDE";
        char c[]=st.toCharArray();

        System.out.println(Arrays.toString(c));

        System.out.println("=====");

        String str1="DCEBA";
        String str2="ABCDE";
        char [] c1=str1.toCharArray();
        char [] c2=str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.equals(c1, c2));
    }
}


