package day27Recap;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        /*Array methods
        1- sort()  2- ToString() 3- equals()

       */

        String[] names={"Ali", "Veli", "Deli", "Zirdeli"};

        System.out.println(Arrays.toString(names));

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        //max and min for sort of array
        int[] arr = {11, 2, 31, 4, 51};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println("Max is "+ arr[arr.length-1]);
        System.out.println("Min is "+ arr[0]);


//equality

        String[] s1={"a","b","c"};
        String[] s2={"a","b","c"};
        System.out.println(Arrays.equals(s1, s2));
// sort of array then check all indexed all equal or not

        String[] s11={"b","c","a"};
        String[] s21={"a","c","b"};
        Arrays.sort(s11);
        Arrays.sort(s21);
        System.out.println(Arrays.equals(s11, s21));

        //deepToString => to write 2D or more multiD print array

    }
}
