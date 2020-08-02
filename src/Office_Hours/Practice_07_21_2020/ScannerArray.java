package Office_Hours.Practice_07_21_2020;


import java.util.Arrays;
import java.util.Scanner;

public class ScannerArray {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("how many numbers for array");

        int size=scan.nextInt();

        int[] arr=new int[size];

        for(int i=0; i<size;++i) {
            System.out.println("enter numbers");
            arr[i]=scan.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);

      int [] ar=  descendingArray(arr);
        System.out.println(Arrays.toString(ar));
    }

    public static int[] descendingArray(int[] arr) {

        Arrays.sort(arr);

        int[] desc=new int[arr.length];

        int c=arr.length-1;
        for(int a: arr) {
            desc[c]=a;
            c--;
        } return desc;
    }



}








