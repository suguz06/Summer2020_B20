package day17_String_continue;

import java.util.Scanner;

public class String_Methods {

    public static void main(String[] args) {


        //charAt(index)

        String str="Cybertek";

        char ch=str.charAt(2);
        System.out.println(ch);

        //+
        String st="School";
        char a='s'; char b='t';
        System.out.println(" " +a+b);
        String str2=str+ " "+  st;
        System.out.println(str2);

//// trim

        String ss="     d   d       ";
        System.out.println(ss.trim());

        // indexOf() or lastIndexOf() ==> returns int

        String str8="Hello Batch 20, Have a Wonderful Day";
int t= str8.lastIndexOf("W",0);
        System.out.println(str8.lastIndexOf(" "));

        /// replace,  replaceFirst

        String str9="Hello Batch Java 20, Have a Wonderful Java Day";

        System.out.println(str9.replace("Java", "C#"));


    }
}
