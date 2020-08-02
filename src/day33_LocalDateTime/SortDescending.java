package day33_LocalDateTime;

import java.util.Arrays;

public class SortDescending {

    public static void main(String[] args) {
        int[] arr={11,23,32,12,4,5};
arr=sortDescending(arr);
        System.out.println(Arrays.toString(sortDescending(arr)));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int [] des=new int[arr.length];

        int c=arr.length-1;
        for (int a: arr) { des[c]=a;
            c--;
        }

        System.out.println(Arrays.toString(des));
    }

    public static int[] sortDescending(int[] arr) {
        Arrays.sort(arr);
        int [] des=new int[arr.length];
        int c=arr.length-1;
        for (int a: arr) { des[c]=a;
            c--;
        }
        return des;



    }



}
