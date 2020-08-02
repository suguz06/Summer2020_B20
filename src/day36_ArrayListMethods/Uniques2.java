package day36_ArrayListMethods;

import java.util.ArrayList;
import java.util.Collections;

public class Uniques2 {

    public static void main(String[] args) {


        // by using Collections frequency class

        ArrayList<Integer> al= new ArrayList<>(); //{1,1,2,3,3}

        al.add(1);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(3);
        al.add(99);
        System.out.println(al);
        ArrayList<Integer> uniq= new ArrayList<>();

        for(Integer a:al) {
             if(Collections.frequency(al, a)==1) uniq.add(a);
        }
        System.out.println("Frequency 1 elements are "+ uniq);




    }
}
