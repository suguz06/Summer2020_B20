package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;

public class ArraysDescending {

    public static void main(String[] args) {


        int[] arr= {1,3,53,564,3,56,35,7};

        Arrays.sort(arr);
        int[] dec=new int[arr.length];

        //for descending order
        int c=arr.length-1;
        for(int each: arr) {
            dec[c]=each;
            c--;
        }
        System.out.println(Arrays.toString(dec));


    }
}
