package day29_CustomMethods;

import java.util.Arrays;

/*

    11. wirte a method that can print out the maximum number
    from any array of integers
    12. wirte
 */
public class MaxMin {

    public static void MaxNum(int[] arr) {

//        Arrays.sort(arr);
//        max=arr [arr.length-1 ];
        int max=arr[0];

        for(int each:arr) {
            if(each>max) max=each;
        }
        System.out.println("Max is "+ max);



    }


    public static void MinNum(int[] arr) {

//        Arrays.sort(arr);
//        max=arr [arr.length-1 ];
        int min=arr[0];

        for(int each:arr) {
            if(each<min) min=each;
        }
        System.out.println("Min is "+ min);



    }


    public static void main(String[] args) {
        int[] arr={12,34,644,33,67,32};

        MaxNum(arr);
        MinNum(arr);
    }



}
