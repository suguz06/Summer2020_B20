package day36_ArrayListMethods;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_Practices {


    public static void main(String[] args) {

        // arraylist decsending order


        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(40);
        list.add(50);
        list.add(20);

        Collections.sort(list);
        System.out.println(list);
        ArrayList<Integer> desc=new ArrayList<>( );


        int i=list.size()-1;
        for (int  a:list) {
            desc.add(list.get(i));
            --i;
        }
        System.out.println(desc);

    }
}
