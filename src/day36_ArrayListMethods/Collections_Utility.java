package day36_ArrayListMethods;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collections_Utility {

    public static void main(String[] args) {

        /*
        Arrays=> util class for array
        Collections => util for collection
         */

        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(50);
        list.add(20);

        System.out.println(list);

        //sort() => for Collections class=>> use the sort
        Collections.sort(list);

        System.out.println(list);

        System.out.println("Max is "+ list.get(list.size()-1));
        System.out.println("Min is "+ list.get(0));

    }
}
