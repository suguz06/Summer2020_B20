package day02_printStatements;



public class TestingJava {

    public static void main(String[] args) {

        String s="Hello World";
        String s1=new String("Hello World");
        String s2=new String("Hello World");
         s.substring(0, 6); // Hello

        System.out.println(s.substring(0, 6));
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s1.equals(s2));

    }
}



