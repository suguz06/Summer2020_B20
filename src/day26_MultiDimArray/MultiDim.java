package day26_MultiDimArray;

import java.util.Arrays;

public class MultiDim {


    public static void main(String[] args) {


        int [] [] nums={{1},{3,3},{5,56,6},{5,6,7}};

        /* print this
        {1},
        {3,3},
        {5,56,6},
        {5,6,7}

         */
        for(int[] a: nums )  {
            System.out.println(Arrays.toString(a));

        }
        System.out.println(Arrays.deepToString(nums));
//Arrays.deepToString ==>> converts multi D array to String
        // ArraystoString for 1D array


    }
}
