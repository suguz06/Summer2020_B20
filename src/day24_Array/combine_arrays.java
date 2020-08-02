package day24_Array;

import java.util.Arrays;

public class combine_arrays {

    public static void main(String[] args) {


        int a[] = {1, 3, 5, 6, 6};
        int b[] = {6, 3, 56, 78};

        int index = 0;
        int merged[] = new int[a.length + b.length];
        for (int each : a) { merged[index]=each;
                index++; }
        for (int each: b) { merged[index]=each;
            index++;
        }

        System.out.println(Arrays.toString(merged));
    }

}
