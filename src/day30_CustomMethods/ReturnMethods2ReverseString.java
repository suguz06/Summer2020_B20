package day30_CustomMethods;

public class ReturnMethods2ReverseString {

    public static void main(String[] args) {

        String name="Level";
        reverseStr(name);
        System.out.println(reverseStr1(name).equalsIgnoreCase(name) );
   if(reverseStr1(name).equalsIgnoreCase(name)){
       System.out.println("palindrome");
   } else System.out.println("not palindrome");

    }


// void method
    public static void reverseStr(String str) {

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; --i) {

            reverse +=   str.charAt(i);
        }
        System.out.println(reverse); }


// return methods of Strings
    public static String reverseStr1(String str) {

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; --i) {

            reverse += "" + str.charAt(i);
        }
        return reverse; }







}