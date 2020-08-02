package day25_Loop_RECAP;

import java.util.Arrays;

public class CombineArraysINCLASS {

    public static void main(String[] args) {

        int[] arr1 = {11, 2, 23};
        int[] arr2 = {4,15};

        int size=arr1.length+arr2.length;

        int[] arr3=new int[size];
        int c=0;
        for(int each:arr1) {
            arr3[c]=each;
            c++;
        }

        for(int each:arr2) {
            arr3[c]=each;
            c++;
        }
        System.out.println(Arrays.toString(arr3));
//max of arra3.


        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println("max is "+ arr3[arr3.length-1]);
        System.out.println("min is "+ arr3[0]);
    }
}
