package day16_String;


/*
1. replace(old value, new value)=>> new value will be replaced all
given old values

2. replaceFirst() first changes OK
 */
public class Replace_Practice {


    public static void main(String[] args) {

        String s1= "I like to learn Java, Java is cool, Java is fun";

        System.out.println(s1.replace("Java", "C#"));

        System.out.println(s1.replaceFirst("a, Java", "a, C#"));

        System.out.println(s1.replace("Java ", "Pyton "));
        System.out.println(s1.replaceFirst("Java", "C"));

        System.out.println(s1.replaceFirst("Java", "C++"));
        System.out.println(s1.replaceFirst("Java", "C--").replaceFirst("C--", "Java+"));
    }
}
