package day36_ArrayListMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {

        ArrayList<Character> list= new ArrayList<>();

        list.add('A');
        list.add('B');
        list.add('A');
        list.add('B');
        list.add('C');

        System.out.println(list);

ArrayList<Character> nonDup=new ArrayList<>();

 for(Character c: list) {
     if(!nonDup.contains(c)) {
         nonDup.add(c);
     }
 }
        System.out.println(nonDup);


        System.out.println("====");

//equals()  => compare to arrlist
        ArrayList<String > a1=new ArrayList<>();

        a1.add("Cybertek");

        ArrayList<String > a2= new ArrayList<>();

        a2.add("cybertek");

        System.out.println(a1.equals(a2));

// isEmpty() => check size is zero or not

        System.out.println(a1.isEmpty());
ArrayList<Integer> a3= new ArrayList<>();
        System.out.println(a3.isEmpty());

    }
}
