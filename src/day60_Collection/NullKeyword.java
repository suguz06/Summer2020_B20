package day60_Collection;

public class NullKeyword {

    public static void main(String[] args) {
        String s1="Cybertek"; //String Literal


        System.out.println(s1.toUpperCase());


        String s2=null; //non primitive default type => object default type

        System.out.println(s2);
        System.out.println(s2.toUpperCase());//nullPointerException


    }
}
