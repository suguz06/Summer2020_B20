package day25_Loop_RECAP;

import java.util.Arrays;
import java.util.Scanner;

public class CombineArrays {
    public static void main(String[] args) {



    Scanner scan=new Scanner(System.in);
    System.out.println("Enter array");
    int[] arr1=new int[5];
    for (int i=0;i<5;++i) {
        arr1[i]=scan.nextInt();
    }
        System.out.println("Enter array");
        int[] arr2=new int[5];
        for (int i=0;i<5;++i) {
            arr2[i]=scan.nextInt();
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        int[] combine= new int[arr1.length+arr2.length];
        for(int i=0;i<5;++i) {
            combine[i]=arr1[i];

        }
        for(int i=0;i<5;++i) {
            combine[i+arr1.length]=arr2[i];

        }
        System.out.println(Arrays.toString(combine));



}}
