package day26_MultiDimArray;

import java.util.Arrays;
import java.util.Scanner;

public class SortDescending {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("pls enter an size of array");
        int size=scan.nextInt();
        int[] arr= new int[size];

        System.out.println("pls enter of array elements");
        for(int i=0; i<size;++i){
            arr[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        //descending order
        Arrays.sort(arr); //first sort of ascending order

        int[] desArray=new int[size];

        for(int i=0; i<size;++i){
            desArray[i]=arr[size-1-i];

        }
        System.out.println(Arrays.toString(desArray));




    }
}
