package day15_String_Class;


import java.lang.String;

public class String_Intro {

    public static void main(String[] args) {


        String str1="Cybertek";

        String str2="Cybertek";

        String str3= new String("Cybertek");
        String str4= new String("Cybertek");
// Java heap : all objects inside, String pool: just string literals (no duplication)
        System.out.println(str1==str2  ); // same becuase using String literals in String pool
        System.out.println(  str1==str3); // different one is pool the other in Java heap not pool
        System.out.println(str3==str4); //different object by using new keyword
        // Just compare to memory places
    }
}
