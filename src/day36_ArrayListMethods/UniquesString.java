package day36_ArrayListMethods;

import java.util.ArrayList;
import java.util.Collections;

public class UniquesString {

    /*
    uniques string elements without nested loop
     */

    public static void main(String[] args) {

String s="ssssytrrrr ";
        ArrayList<String> r=new ArrayList<>();
for(String a:s.split("")){
    r.add(a);
}

        System.out.println(r);
 for(String x: r) {
     if(Collections.frequency(r, x)==1) System.out.println(x);
    }

        System.out.println("=======================");

 String as="AABBBCCCDDDEEEE"; //A2B3C3D3E4
        ArrayList<String> el=new ArrayList<>();

        for(String  a: as.split("")) {
            el.add(a);
        }

        String nonDup="";

        for (String a: as.split("")) {
            if(!nonDup.contains(a)) nonDup +=a;
        }

        ArrayList<String > ls=new ArrayList<>();


        for(String a: nonDup.split("")) {
             ls.add(a);
        }
        System.out.println(ls);
        for (String a: ls) {
            System.out.print(a+Collections.frequency(el, a));
        }


} }
