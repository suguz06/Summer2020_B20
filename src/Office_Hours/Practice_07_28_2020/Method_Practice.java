package Office_Hours.Practice_07_28_2020;

public class Method_Practice {

    public static void main(String[] args) {


        System.out.println(reverseStr("123"));
        System.out.println(reverseStr1("123"));
        System.out.println(reverseStr2("123"));
        System.out.println(reverseStr3("123"));
        System.out.println(isPalindrome("level"));
        System.out.println(isPalindrome("selman"));
    }


    //Access modifier Specifer RETURN TYPE NameMETHOD (Parameter) {
    //  code fragment  }


    public static String reverseStr(String s) {

        String reverse = "";

        int i = 0;
        for (String a : s.split("")) {
            reverse += s.charAt(s.length() - 1 - i);
            ++i;
        }
        return reverse;
    }


    public static String reverseStr1(String s) {

        String reverse = "";


        for (int i = 0; i <= s.length() - 1; ++i) {
            reverse += s.charAt(s.length() - 1 - i);
        }
        return reverse;
    }

    public static String reverseStr2(String s) {

        String reverse = "";
        int i = s.length() - 1;
        while (i >= 0) {
            reverse += s.charAt(i);
            --i;
        }
        return reverse;
    }


    public static String reverseStr3(String s) {

        String reverse = "";
        int i = s.length() - 1;
        do {

            reverse += s.charAt(i);
            --i;

        }
        while (i >= 0);
        return reverse;
    }


    public static boolean isPalindrome(String s) {

//  write all reverse string codes Or you use above methods
        if(reverseStr(s).equalsIgnoreCase(s)) return true;
        else return false;

    }
}
