package day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethods4CombineArray {

    public static void main(String[] args) {
int [] a={1,2,3,4};
int [] b={5,6,7,8,9,10};
int[] combined=combine2Array(combine2Array(a,b),b);
        System.out.println(Arrays.toString(combined));

    }

    public static int[] combine2Array(int[] arr1,  int[] arr2 ) {


        int[] arr3 = new int[arr1.length + arr2.length];

        int c = 0;
        for (int a : arr1) {
            arr3[c] = a;
            c++;
        }
        for (int b : arr2) {
            arr3[c] = b;
            c++;
        }

         return arr3;
    }





}
