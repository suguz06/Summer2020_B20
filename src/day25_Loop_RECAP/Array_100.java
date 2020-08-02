package day25_Loop_RECAP;


import java.util.Arrays;

/*
Create an int array called numbers that
has length of 100 and Assign 1-100 to each index of the array.
then print out all the even numbers. MUST use continue statement

 */
public class Array_100 {

    public static void main(String[] args) {

        int[] arr = new int[100]; //default int=0
//        String[] str = new String[100]; //default string=null
//        boolean[] b=new boolean[100]; //default boolean false
       // System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(str));
//        System.out.println(Arrays.toString(b));

        for (int i = 1; i < 100; ++i) {
            arr[i] = i + 1;
        }

        for (int each : arr) {
            if (each % 2 != 0) continue;
            System.out.print(each+ " ");
        }
    }
}
