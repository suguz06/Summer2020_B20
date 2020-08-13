package day02_printStatements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestingJava {

    public static void main(String[] args) {

        String str = "Sweat sweat";
        System.out.println(str.trim().charAt(6)+""+str.indexOf("Sw",1));

        ArrayList<Integer> points= new ArrayList<>();


        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);
        //System.out.println(points);
        points.remove(1);
        //System.out.println(points);
        points.remove(null);


        System.out.println(points);

        int arr[] ={1,2,3};
        int ar2[]=new int [5];
        ar2=arr;
        System.out.println(Arrays.toString(ar2));






    }


}
