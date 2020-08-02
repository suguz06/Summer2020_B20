package day32_OverloadMethods;


import Library.Util;

import java.util.Arrays;

public class MethodCall {


    public static void main(String[] args) {
        String fName="elKEeme";

        String lName="eKeneE";
       String name= Util.formatFullName(fName, lName);

        System.out.println(name);

        System.out.println(Util.uniques(name));
        System.out.println(Util.reverse(name));
        System.out.println(Util.removeDup(name));
        System.out.println(Util.frequency(name, 'e'));
        System.out.println(Util.frequencyOfChars(name));



        int[] arr={1,3,55,33,56,775,33};
        int num=350;
      int[] c=  Util.addElement(arr, num);
        System.out.println(Arrays.toString(c));
    }


}
