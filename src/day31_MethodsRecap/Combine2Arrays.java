package day31_MethodsRecap;

import java.util.Arrays;

public class Combine2Arrays {

    public static void main(String[] args) {

        int[] arr1={1,3,4};

        int[] arr2={3,2,6,8};

        combine2Arrays(arr1, arr2);

        System.out.println(Arrays.toString(combine2Arrays(arr1, arr2)));
    }


    public static int[] combine2Arrays(int[] arr1, int[] arr2) {

        int[] arr3= new int[arr1.length+ arr2.length];

        int i=0;
        for(int a: arr1) {
            arr3[i]=a;
            ++i;
        }

        for(int b: arr2){
            arr3[i]=b;
            ++i;
        }
        return arr3;

    }



}
