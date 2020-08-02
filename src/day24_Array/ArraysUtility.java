package day24_Array;
//import java.util.*; all utility packages
//import java.util.Arrays; //spesific class



/*
1- Arrays.toString  ==> to write array
convert array to String

2- Arrays.sort() ==>> ascending order (ascii) of array, alphabetic order

3- Arrays.equals(arr1,arr2) ==> check the equality of arrays
returns boolean
 */


import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3};

        System.out.println(arr); //hascode not array


        String s1 = Arrays.toString(arr);
        System.out.println(s1);

        String[] names = {"0", "caa", "bb", "cc"};
        Arrays.sort(names);
        String s2 = Arrays.toString(names);
        System.out.println(s2);

        System.out.println("------=============-------------");

        int[] arr1 = {1, 2, 3, 6, 8, 3};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1); //ascending order
        System.out.println(Arrays.toString(arr1));

        System.out.println("max is " + arr1[arr1.length - 1]);
        System.out.println("min is " + arr1[0]);


        System.out.println("=======");

        String[] students = {"mehmet", "elkem", " meee", " 0tt"};

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));


        System.out.println("================");
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {2, 3, 1};


        Arrays.sort(arr2);
        Arrays.sort(arr3);//arr3=[1 2 3]
        Arrays.sort(arr4); // arr4=[1 2 3 ]
        boolean b1 = Arrays.equals(arr3, arr4);
        System.out.println(b1);

        int[] arr5 = {1, 3, 4, 5};
        int[] arr6 = {2, 4, 6};
        boolean b3 = Arrays.equals(arr5, arr6);  //false since length different
        System.out.println(b3);

    }
}