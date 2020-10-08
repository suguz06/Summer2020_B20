package day61_Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {

     /*
        write a program that can remove the
        duplicated Integers from a List of Integer
            Do Not change the insertion order
         */

    public static void main(String[] args) {


        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,54,4,5,64,4,24,34,4,24,12,4,1));


        System.out.println(list);


        LinkedHashSet<Integer>  set=new LinkedHashSet<>(list); // all the duplicates are removed

        System.out.println(set);

        list.clear();
        list.addAll(set);
        System.out.println(list);



    }
}
