package day36_ArrayListMethods;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {

        ArrayList<Integer> al= new ArrayList<>(); //{1,1,2,3,3}

        al.add(1);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(3);
        al.add(99);
        al.add(3);
        System.out.println(al);
        //indexOf(element) ==> give index number

        int a=al.indexOf(99);

        System.out.println(a);
        System.out.println(al.indexOf(80)); // returns -1=> since no elements 80

        //lastIndexOf()  => last index element

    int b=al.lastIndexOf(3);
        System.out.println(al);
        System.out.println(b);

//contain()  =>check contains or not  =>returns boolean

        System.out.println(al.contains(9)); // no number 9 =>false

    }
}
