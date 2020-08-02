package day24_Array;

import java.util.Scanner;

/*
2. write a program that asks user how many numbers
he wants to enter, and get all the user inputs and
 store them into an array variable,
 and then write the program that can return maximum and minimum numbers

 */
public class MaxMinNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers u enters ");
        int size = scan.nextInt();

        int[] arr = new int[size];
// asssign the array elements
        for (int i = 0; i <= size - 1; ++i) {
            arr[i] = scan.nextInt();
        }
        // System.out.println(arr[0]);
        //find max min
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i <= size - 1; ++i) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("max is " + max + " min is " + min);


    }


}
