package day27Recap;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]);
        }
        System.out.println();
        System.out.println("-----------");

        for (int a : arr) {
            System.out.print(a);
        }

        System.out.println();
        //reverse order

        for (int i = arr.length - 1; i >= 0; --i) {
            System.out.print(arr[i]);
        }
        System.out.println();

        int i = 0;
        int length = arr.length - 1;
        int[] reverse = new int[length + 1];

        for (int each : arr) {
            reverse[length - i] = each;
            i++;
        }
        System.out.println(Arrays.toString(reverse));


    }
}
