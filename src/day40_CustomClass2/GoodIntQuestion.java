package day40_CustomClass2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Given an array of integers. how do you put zeros at the end of array without sorting an array?
For example: input: [4,5,0,0,2,0,1,0] output: [4,5,2,1,0,0,0,0]

 */
public class GoodIntQuestion {

    public static void main(String[] args) {

        Integer [] arr={1,2,0,3,0,0,0,0,4,0,7};  // result=12347 000

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(arr));



        ArrayList<Integer> list1=new ArrayList<>();
        list1.addAll(list);
        System.out.println(list);

        list.removeAll(Arrays.asList(0));

        System.out.println(list);


        for(int i=0; i<= Collections.frequency(list1, 0)-1; ++i) {
            list.add(0);
        }

        System.out.println(list);

        list.toArray();

        System.out.println(Arrays.toString(list.toArray()));

     int [] arr1={1,2,0,3,0,0,0,0,4,0,7};
        pushZerosToEnd(arr1);


        System.out.println(Arrays.toString(pushZerosToEnd(arr1)));
    }

   public static int[] pushZerosToEnd(int arr[])
    {
        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
            // incremented
        }
        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < arr.length) {
            arr[count++] = 0; }
        return arr;
    }
}
