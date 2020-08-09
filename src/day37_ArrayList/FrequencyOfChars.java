package day37_ArrayList;

import Library.Util;


import java.util.ArrayList;
import java.util.Collections;

/*
 2. write a program that can find the frequency of character from a String
                        DO NOT use nested loop
                        "AABBCCDDEE"  ==> "ABCDE"
                        output: A2B2C2D2E2

 */
public class FrequencyOfChars {

    public static void main(String[] args) {

        ArrayList<String> list= new ArrayList<>();
       String str= "AABBCCDDEEF";
        for(String each: str.split("")) {
            list.add(each);
        }

        // OR by using asList(str.Split("");

        System.out.println(list);
String nonDup= Util.removeDup(str);

        for (String each: nonDup.split("")) {
         int a=   Collections.frequency(list,each);
            System.out.print(each+a);
        }
    }
}
