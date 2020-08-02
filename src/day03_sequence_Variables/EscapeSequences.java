package day03_sequence_Variables;

public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("Hello Everyone \nMy name is Cybertek");
        System.out.println("Hello Everyone \n My name is Cybertek");
        System.out.println("\n\n\t\tHello Everyone \n My name is Cybertek");
        /*
         between the double qoutes : to give a new messages
         \n: append new line  (using backslash  \n \n )
         \
         \ ==>> give a mistake since system is waiting escape seqs;
         to write backslash ===>>>> \\ double backslash needed
         */
        System.out.println("Hello Everyone \t \nMy name is Cybertek");
        System.out.println("Hello Everyone \t My name is Cybertek");
        System.out.println("\tHello Everyone \n My name is Cybertek");
        System.out.println("\\"); // write one backslash
        System.out.println("\\\\"); // two backslash
        System.out.println("/"); // one slash
        System.out.println("//"); // give two front slash
        System.out.println("My name is \'Selman\' ");
        System.out.println("My name is \"Selman\" ");
        System.out.println("My favorite TV-Series: \"Game of Thorens\"");




    }
}