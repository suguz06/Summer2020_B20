package day25_Loop_RECAP;

public class ShortestString {

    public static void main(String[] args) {

        String[] str = {"aa", "b", "c", "vvvv", "fffdf", "dddddd"};

        int min = str[0].length();
        String result = "";
        for (int i = 0; i < str.length; ++i) {

            if (str[i].length() <= min) {
                min = str[i].length();
                result = str[i];
            }
        }
        for (int i = 0; i <= str.length - 1; i++) {  // to see how many strings' lengths in the array is matching with minLength
            if (str[i].length() == min) {
                System.out.println(str[i]);

            }
        }
    } }