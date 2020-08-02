package day29_CustomMethods;

public class PalindromeTest {

/*
reverse=str ==> palindrome eg. kayak, alla, etc
 */
    public static void main(String[] args) {
        PalindromeTest.palindrome("kayak");
        PalindromeTest.palindrome("java");
    }


    public static  void palindrome(String str) {

        String reverse="";
        for(int i=str.length()-1; i>=0;--i) {

            reverse +=str.charAt(i);
        }
        if(reverse.equalsIgnoreCase(str)) {
            System.out.println("palindrome");
        } else System.out.println("not polindrome");
    }


    public static  void reverse(String str) {

        String reverse="";
        for(int i=str.length()-1; i>=0;--i) {

            reverse +=str.charAt(i);
        }
        System.out.println(reverse);
    }



}
