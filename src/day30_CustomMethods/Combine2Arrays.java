package day30_CustomMethods;

import java.util.Arrays;

public class Combine2Arrays {


    public static void main(String[] args) {
int [] a={1,2,3};
int[] b={4,5,6};
combine2Array(a,b);

    }



      static void combine2Array(int[] arr1, int[] arr2){

        int[] arr3=new int[arr1.length+arr2.length];

        int i=0;
        for(int each: arr1){
            arr3[i]=each;
            ++i;
        }
        for(int each: arr2){
            arr3[i]=each;
            ++i;
        }

        System.out.println(Arrays.toString(arr3));
    }
}


