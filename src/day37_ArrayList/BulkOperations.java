package day37_ArrayList;

import java.io.CharArrayReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        boolean a= list.contains(1);  //true just check one element

        ArrayList<Integer> elements=new ArrayList<>();
        elements.add(1); elements.add(2); elements.add(5);

      boolean r2=  list.containsAll(elements);  //check arraylist contain  or not

        System.out.println(r2);
        boolean r3=  list.containsAll(list);  //check arraylist contain  or not

        System.out.println(r3);

        System.out.println("======================");


        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        //verify that 1,2,4 are contained in the list2
        // one way check by one by OR containsAll(list)

      boolean b=  list2.containsAll(Arrays.asList(10,2,4));

       Integer [] arr={1,2,4};

        boolean b1=  list2.containsAll(Arrays.asList(arr));

        System.out.println(b);
        System.out.println(b1);

    }
}
