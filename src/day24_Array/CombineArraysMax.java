package day24_Array;


import java.util.Arrays;

/*
  2. write a program that can combine two arrays of
  integers and then print out the maximum number
    Ex:
        arr1 = { 1,2,3,4}
        arr2 = {5,6,7,8}
        output:
            arr3 = {1,2,3,4,5,6,7,8}
            max: 8


 */
public class CombineArraysMax {

    public static void main(String[] args) {
        int[] array1 = {4, 2, 3};
        int[] array2 = {4, 25, 6};

        int length = array1.length + array2.length;

        int[] result = new int[length];
        int pos = 0;
        for (int element : array1) {
            result[pos] = element;
            pos++;
        }

        for (int element : array2) {
            result[pos] = element;
            pos++;
        }

        System.out.println(Arrays.toString(result));

            Arrays.sort(result);
        System.out.println(  Arrays.toString(result) );
        System.out.println("max is: "+ result[length-1]);
        System.out.println("min is: "+ result[0]);

    }
}
