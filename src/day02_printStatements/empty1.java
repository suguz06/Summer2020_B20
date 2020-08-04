package day02_printStatements;
import Library.Util;

import java.util.ArrayList;
import java.util.Arrays;

public class empty1 {




    public static void main(String[] args)
    {

 String s="AAAFDGFRRRRG$$";

 String [] sa= s.split("");
        ArrayList <String> sl= new ArrayList<>  (Arrays.asList(s.split("")));

        System.out.println(Arrays.toString(sa));

        System.out.println(sl);
        System.out.println(sl.equals(sa));
Object [] a=sl.toArray();

        System.out.println(sa.equals(a));


        Integer [] aa={1,2,3,45,6};

        ArrayList <Integer> s1=new ArrayList<>();
        s1.addAll(Arrays.asList(aa));
        System.out.println(s1);

        s1.removeIf(p-> p<5);
        Integer w=45;
s1.remove(w);
        System.out.println(s1);
    } }





