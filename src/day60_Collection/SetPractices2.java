package day60_Collection;

import java.util.*;

public class SetPractices2 {

    public static void main(String[] args) {


        //Task 1

        // 1. write a program that can identify if two strings are build out of same characters
        //        ex:
        //            str1 = "abcabc"
        //            str2 = "cab"
        //            output:
        //                true

        String str1 = "abcabc"; // TreeSet do it same way

        str1 = new HashSet<>(Arrays.asList(str1.split(""))).toString();

        String str2 = "cab"; // TreeSet do it same way
        str2 = new HashSet<>(Arrays.asList(str2.split(""))).toString();

        System.out.println(str1.equals(str2));


//Task 2

//        2. write a program that can remove duplicates from an array of String.
//        at the end MUSt return array

        String[] arr = {"d", "a", "b", "c", "a", "b", "d", "c"};

        System.out.println(Arrays.toString(arr));

        Set<String> st = new TreeSet<>();
        st.addAll(Arrays.asList(arr));

        Set<String> st1 = new LinkedHashSet<>();
        st1.addAll(Arrays.asList(arr));

        Set<String> st2 = new HashSet<>();
        st2.addAll(Arrays.asList(arr));


        System.out.println(st);
        System.out.println(st1);
        System.out.println(st2);


        System.out.println("=========================");

        String[] names = {"Alia", "Mustafa", "Ali", "Alia", "Mustafa", "Ali", "Alia", "Ali"};

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.addAll(Arrays.asList(names));
        System.out.println(set1);

        names = set1.toArray(new String[0]); //ToArray (inside String [0])
// converting collection type to Array

        System.out.println(Arrays.toString(names));

        System.out.println("=========================");

        String[] names2 = {"Roman", "Abzal", "Nurbiye", "Roman", "Abzal", "Nurbiye", "Roman", "Abzal" };

//without the changing the order
names2=new LinkedHashSet<>(Arrays.asList(names2)).toArray(new String [0]);

//new String[0] ==> to initiliaze the String array => not important size 0

        System.out.println(Arrays.toString(names2));


        System.out.println("============================");


        Integer [] numbers={1,1,2,1,1,3,2,2,0,0,0,4,5,4,6,4,6,4,8,72,1};

       // numbers= new LinkedHashSet<>(Arrays.asList(numbers)).toArray(new Integer[0]);

       // numbers= new HashSet<>(Arrays.asList(numbers)).toArray(new Integer[0]);

        numbers= new TreeSet<>(Arrays.asList(numbers)).toArray(new Integer[0]);

        System.out.println(Arrays.toString(numbers));

    }
}
