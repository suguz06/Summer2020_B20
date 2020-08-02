package day32_OverloadMethods;

import java.util.Arrays;

public class AddElements {

    public static void main(String[] args) {
        int[] arr2={1,2,3};
        int num=4;
       int[] a= addElement(arr2, 4);
        System.out.println(Arrays.toString(a));

    }



    public static int[] addElement(int[] arr, int num) {

        int[] arr1=new int[arr.length+1];
        int i=0;
        for(int a:arr) {
            arr1[i]=a;
            ++i;
        }
        arr1[i]=num;
        return arr1 ;
    }




}
