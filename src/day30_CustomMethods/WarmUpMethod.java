package day30_CustomMethods;

import java.util.Arrays;

/*
wamrmup tasks:
    1. create a function that can print out the
    maximum number between two numbers
    2. create a function that can print out the
    array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.



 */
public class WarmUpMethod {

    public static void maxNum(int num1, int num2) {
        int max = (num1 > num2) ? num1 : num2;
        System.out.println(max+ " is maximum");
//        if(num1>num2) {System.out.println(num1);}
//        else System.out.println(num2);

    }


    public static void main(String[] args) {

        maxNum(23, 36);
        int arr1[] = {1, 3, 8, 90, 56};
        int arr2[] = {12, 32, 82, 90,20, 56};
        descendingArr(arr1, 5);

        combineArray(arr1,5,arr2, 6);
    }

    //Arrays descending order

    public static void descendingArr(int[] arr, int size) {

        Arrays.sort(arr);
        int[] reverse = new int[size];

        for (int i = 0; i <= size - 1; ++i) {
            reverse[i] = arr[size - 1 - i];
        }

        System.out.println(Arrays.toString(reverse));
    }

//3. create a function that can print out the combination of two integer arrays

    public static void combineArray(int[] arr1, int size1, int[] arr2, int size2) {


        int[] combine = new int[size1 + size2];

        int c = 0;
        for (int a : arr1) {
            combine[c] = a;
            c++;
        }
        for (int b : arr2) {
            combine[c] = b;
            c++;
        }

         System.out.println(Arrays.toString(combine));
    }


}





