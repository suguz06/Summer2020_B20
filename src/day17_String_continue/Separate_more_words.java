package day17_String_continue;

public class Separate_more_words {

    public static void main(String[] args) {


        String s = "Java String Quiz 346 45465";


        int a=s.indexOf(" ");
        int b=s.indexOf(" ", a+1);
        int c=s.indexOf(" ", b+1);
        //int d=s.indexOf(" ", c+1); //continuosly we find it..
        //note that one empty between words
         int d=s.lastIndexOf(" ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
