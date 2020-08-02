package day37_ArrayList;

import javax.crypto.spec.PSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 1. write a program that can find the unique characters from a string
                        DO NOT use nested loop
                        "ABABCDEE"
                        output: C D

 */
public class UniquesCollections {

//    public static void main(String[] args) {
//        ArrayList<Integer> al= new ArrayList<>();
//        al.add(1); al.add(1);al.add(2); al.add(3); al.add(3); al.add(4); al.add(5);
//        System.out.println(al);
//        //String re="";
//        ArrayList<Integer> alist= new ArrayList<>();
//        for(int a: al){
//            int c=0;
//            for(int b:al) {
//                if(a==b) c++;
//            } if(c==1) alist.add(a);
//        }
//        System.out.println(alist);

    public static void main(String[] args) {


        ArrayList<Character> list = new ArrayList<>();


        String st = "ABABCDEEFGH";
        for (char a : st.toCharArray()) {
            list.add(a);
        }

//         ArrayList<String> list = new ArrayList<>();
//
//        for (String e: st.split("")) {
//            list.add(e);
//        }

        System.out.println(list);

       int count= Collections.frequency(list, 'A');
        System.out.println(count);

        if(count==1) System.out.println("A");

 String uniques="";
        for(Character a: list) {
            if(Collections.frequency(list, a)==1) {
                System.out.println(a);
            uniques +=a;}
        }

        System.out.println(uniques);
    }

}