package Office_Hours.Practice_07_14_2020;

import javax.swing.plaf.IconUIResource;

public class Unique {


    public static void main(String[] args) {

        String str = "ABABCD"; //expected result=C
        String result = "";

// method 1
        for (int i = 0; i <= str.length() - 1; ++i) {
            char c = str.charAt(i);
            int count = 0;
            for (int j = 0; j <= str.length() - 1; ++j) {
                char d = str.charAt(j);
                if (d == c) {
                    count++;
                }

            }
            // System.out.println(c+ " : "+count);
            if (count == 1) result += c + " ";
        }
        System.out.println(result);

//method 2
        String result2 = "";
        for (int i = 0; i < str.length(); ++i) {
            char t = str.charAt(i);
            int first = str.indexOf(t);
            int last = str.lastIndexOf(t);
            if (first == last) {
                result2 += t+ " ";
            }


        } System.out.println(result2);

    }
}
