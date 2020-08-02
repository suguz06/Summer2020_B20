package day36_ArrayListMethods;

import java.util.ArrayList;
import java.util.Collections;

public class SwapMethod {

    public static void main(String[] args) {

        ArrayList<String > l2=new ArrayList<>();

       l2.add("A");
        l2.add("B");
        l2.add("C");
        l2.add("D");
        l2.add("E");
        l2.add("F");
        System.out.println(l2);

        //Collections.swap()
        // swap(list, index1, index2) => change elements
        Collections.swap(l2, 0, 1);
        System.out.println(l2);

        //swap first and last elements

        Collections.swap(l2, 0, l2.size()-1);

        System.out.println(l2);


        System.out.println("===================");

        ArrayList<Character> charList= new ArrayList<>();

        charList.add('A');
        charList.add('B');
        charList.add('A');
        charList.add('B');
        charList.add('A');
        charList.add('B');
        charList.add('A');
        charList.add('C');



        int count=Collections.frequency(charList, 'A');

        System.out.println(count);
     }
}
