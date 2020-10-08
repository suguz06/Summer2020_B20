package day61_Maps;

import Library.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


/*
write a program that can remove the palindrome string from a list of String
            DO NOT use Lambda expressions

 */

public class RemovePalindrome {

    public static void main(String[] args) {

        String[] words = {"Level", "Kayak", "Kayak","Zaman", "Ana", "Cybertek"};


        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(words));


        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String each = it.next();
            String reverse=""; //reverse=Util.reverse(each); //also works
            for (int i = each.length()-1; i >=0; i--) {
                reverse +=each.charAt(i);
            }

            System.out.println(each+ " : " + reverse);



            if (each.equalsIgnoreCase(reverse)){
                it.remove();
            }
        }

        System.out.println(list);
    }

}
