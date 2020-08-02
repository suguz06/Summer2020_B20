package day16_String;

public class Contains_ {

    public static void main(String[] args) {

        //contains() ; returns boolean
        // it checks strings include char or not=> not check index

   String s="We love Java, not C#";

        System.out.println(s.contains("java")); //false, since no java
        System.out.println(!s.contains("java"));// true, since no java

// some programme check (contains() ) the your words include or not,
// some political words forbidden after this checking

// startsWith()  ==>>check the first Char or characters=>returns boolean

        System.out.println(s.startsWith("W")); // true
        System.out.println(s.startsWith("We"));//true
        System.out.println(s.toLowerCase().contains("we")); //true since

// endsWith()  ==>>check the first Char or characters =>returns boolean
        System.out.println(s.endsWith("#")); // true
        System.out.println(s.endsWith("t C#"));//true
    }
}


