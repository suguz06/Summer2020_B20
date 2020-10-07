package day60_Collection;

import java.nio.file.LinkOption;
import java.util.*;

public class SetPractices {
//write a program that can remove duplicates from String


    public static void main(String[] args) {


        String str = "fffgggggaaaabbbbbbbccccdddddeeeeee"; //fgabcde

        String[] arr = str.split("");

        System.out.println(Arrays.toString(arr)); //[a, a, a, a, b, b, b, b, b, b, b, c, c, c, c, d, d, d, d, d, e, e, e, e, e, e]


        Set<String> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(arr)); //duplicates removes

        System.out.println(s1); // no insertion order

        Set<String> s2 = new LinkedHashSet<>();
        s2.addAll(Arrays.asList(arr)); //duplicates removes

        System.out.println(s2); //   insertion order


        System.out.println("==============");

        String str2 = "zzzzyyyxxx"; // insertion order, use as list => finally get String=> use ToString method
        str2 = new LinkedHashSet<>(Arrays.asList(str2.split(""))).toString();
        str2 = str2.replace("[", "").replace(",", "").replace("]", "");


        System.out.println(str2);


        System.out.println("===========");

        String a1 = "abcabc";
        String a2 = "cba";

        HashSet<String> b1 = new HashSet<>();
        b1.addAll(Arrays.asList(a1.split("")));
        System.out.println(b1);

        a1 = b1.toString(); // we convert HashSet to String

        HashSet<String> b2 = new HashSet<>();
        b2.addAll(Arrays.asList(a2.split("")));
        System.out.println(b2);

        a2 = b2.toString(); // we convert HashSet to String

        System.out.println(a1.equals(a2));


        System.out.println("====================");
//no use any other variable=> NO TEMPORARY VARIABLE USED
        //USE ALSO HASHSET is OK => since both of them sorted

        String x1 = "cacacabb";
        String x2 = "bbcaaaaa";

        x1 = new TreeSet<>(Arrays.asList(x1.split(""))).toString(); //abc

        x2 = new TreeSet<>(Arrays.asList(x2.split(""))).toString(); //abc

        System.out.println(x1.equals(x2));



    }

}
