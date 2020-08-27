package Office_Hours.Practice_08_26_2020;

public class Palindrome1 {

    public static void main(String[] args) {

        String name = "level";

        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse += name.charAt(i);
        }
        if (reverse.equals(name)) {
            System.out.println("palindrome");

        } else System.out.println("not palindrome");

        System.out.println("palindromeTest(\"leveL\") = " + palindromeTest("leveL"));

    }

    public static boolean palindromeTest(String s){
         String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse.equalsIgnoreCase(s);
    }
}

