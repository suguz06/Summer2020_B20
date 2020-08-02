package day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethods3Max {


    public static void main(String[] args) {

int[] arr={100,54,4534,6657};
int max=max(arr);
        System.out.println(max<500);
    }

   public static int max(int[] arr) {

        Arrays.sort(arr);

       int  max=arr[arr.length-1];
return max;
    }









}
