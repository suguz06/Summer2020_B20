package day27Recap;

import java.util.Arrays;

public class ForEachReverse {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int i = 0;
        int length = arr.length - 1;
        int[] reverse = new int[length + 1];

        for (int each : arr) {
            reverse[length - i] = each;
            i++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse));
    }
}
