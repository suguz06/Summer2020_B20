package day43_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class Data {

    static int[] arr=new int[3];//1,2,3


    static ArrayList<Integer> list=new ArrayList<>(); //10 20 30



    public static void main(String[] args) {


        System.out.println(Arrays.toString(arr));
        System.out.println(list);

    }


    static {
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Static block");

    }


}
