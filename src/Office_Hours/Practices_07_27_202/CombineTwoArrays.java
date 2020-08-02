package Office_Hours.Practices_07_27_202;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {

    public static void main(String[] args) {

        char[] a1 = {'a', 'b', 'c'};
        char[] a2 = {'d', 'e', 'f'};

        char[] a3 = new char[a1.length + a2.length];


        int i = 0;
        for (char a : a1) {
            a3[i] = a;
            ++i;
        }

        for (char b : a2) {
            a3[i] = b;
            ++i;
        }

        System.out.println(Arrays.toString(a3));

    }


}
