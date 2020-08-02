package day17_String_continue;

/*
Remove 3 or more consecutive characters from a string, repeat until there are no more.

eg.

ABCCCCBBA => ABBBA => AA
 */
public class Remove_Three_Conse {

    public static void main(String[] args) {

String s="aaabbbbccccffffff";
        int i = 0;

        while (i <= s.length() - 1) {

            if ((s.charAt(i) == s.charAt(i + 1)) && (s.charAt(i + 2) == s.charAt(i)) && (i <= s.length() - 2)) {
                if (i == 0) {
                    s = s.substring(i + 3, s.length() - 1);
                    i++;
                } else {
                    s = s.substring(0, i - 1) + s.substring(i + 3, s.length() - 1);
                    i++;
                }

            } else if ((s.charAt(i) == s.charAt(i + 1)) && (i <= s.length() - 1)) {
                i += 2;
            } else {
                i++;
            }

        }
    }
}
