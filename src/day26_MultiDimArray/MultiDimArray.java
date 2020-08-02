package day26_MultiDimArray;

import java.util.Arrays;

public class MultiDimArray {

    public static void main(String[] args) {

        /* int[] arr={1,2}; 1-dim arr
        int[] arr1={9,6,4}


        int [] [] arr=                        2d array


         */

        int [] [] arr={ {1,2}, {1,22} , {4,2}};
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(arr[0][0]);
        System.out.println(arr[1]);
/*
     [] [] ==>   arr[index of 1d array number=row]
         => [index of inside elements= column]
         */

        char [] ch1={'A','B'};
        char [] ch2={'C','D','E'};
        char [] ch3={'F','G'};
        int [] arr0={1,1,1,1};

        char[][] ch4={ch1,ch1,ch3};
        System.out.println(ch1);
        System.out.println(arr0);





    }
}
