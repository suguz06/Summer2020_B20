package day25_Loop_RECAP;


import java.util.Arrays;

/*
7. write a program that can sort the array in descending order
        ex:
            arr1: { 10, 11, 8, 9, 12, 5, 15};
            output:
                arr2: {15, 12, 11, 10, 9, 8, 5}
            NOTE: at the end, you must have have
            an array that contains the desending order of the original array
 */
public class DescendingArray {

    public static void main(String[] args) {

       int[]  arr1= { 10, 11, 8, 9, 12, 5, 15};
       //int[]  arr2= { 10, 11, 8, 9, 12, 5, 15};
        int[]  arr2= new int[7];
        Arrays.sort(arr1);

        for(int i=0;i<=arr1.length-1; ++i)
        {
            arr2[i]=arr1[arr1.length-1-i];
        }
        System.out.println("Descending Order \n arr2= "+ Arrays.toString(arr2));
    }
}
