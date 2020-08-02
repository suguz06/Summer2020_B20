package day26_MultiDimArray;

import java.util.Arrays;

public class MultiNested {

    public static void main(String[] args) {

        int[][] scores = {{10, 20, 30, 19, 45}, {60, 55, 75, 105}, {93, 48, 125, 135}};

        for (int[] a : scores) {


            for (int b : a) {

                if (b % 3 == 0 || b % 5 == 0) System.out.println(b);


            }

        }

        System.out.println("========");
        /*
        3d Array int [] [] [] arr= {{   {  }   } };
         */
        int[] [] arr1={{1,3}, {3,5}};
        int[] [] arr2={{1,3,5}, {3,5,9}};
        int [] [] [] arr= { arr1,arr2 };

        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.toString(arr1[0] ));


    }


}




