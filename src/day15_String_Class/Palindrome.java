package day15_String_Class;

public class Palindrome {

    public static void main(String[] args) {


        String str="amaama";
        String reverse="";

        for(int i=str.length()-1; i>=0; i--) {
            reverse +=str.charAt(i);
        }
        if(str.equals(reverse)) {
            System.out.println("yes, it is palindrome");
        }
        else {
            System.out.println("no it is not palindrome");
        }
        System.out.println(reverse);
    }
}
