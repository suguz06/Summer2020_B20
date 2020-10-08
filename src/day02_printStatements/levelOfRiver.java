package day02_printStatements;

import java.util.ArrayList;
import java.util.Collections;

public class levelOfRiver {


    public static void main(String[] args) {

        int [] arr={5,3,6,7,4};
        System.out.println(level(arr));
    }


    public static int level(int [] arr){

        ArrayList<Integer> al=new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {


            for (int j = 0; j <i ; j++) {
                if(arr[i]>arr[j]) {
                    al.add(arr[i]-arr[j]);
                }
            }

        }

        Collections.sort(al);


        return al.get(al.size()-1);
    }


}


