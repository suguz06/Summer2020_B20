package day02_printStatements;

import Library.Util;

import java.util.*;

public class ListTask {

    /*
    . write a program that can remove the even numbers from a Set of Integers
            DO NOT use Lambda expressions

     */

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(2, 5, 4, 7, 8, 6, 2, 1));

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(set);



        /*
        write a program that can remove the duplicated Integers from a List of Integer
            Do Not change the insertion order
         */


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2, 2, 2, 4, 8, 4, 8, 7, 15, 5, 5));

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll(list);

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(list);

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(list);

        System.out.println("hashSet = " + hashSet);
        System.out.println("linkedHashSet = " + linkedHashSet);
        System.out.println("treeSet = " + treeSet);

/*
write a program that can remove the palindrome string from a list of String
            DO NOT use Lambda expressions

 */

        List<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList("Ali", "level", "level","Civic"));


        Iterator<String> iterator3 = list1.iterator();

        while (iterator3.hasNext()) {

            String each = iterator3.next();
            String reverse = Util.reverse(iterator3.next());
            if ( reverse.equalsIgnoreCase(each)) {
                iterator3.remove();
            }

//            String next = iterator1.next();
//            String[] split1 = next.split("");
//            String[] split = next.split("");
//            Arrays.sort(split);
//            if (split.equals(split1)) iterator1.remove();


        }

        System.out.println(list1);


    }
}
