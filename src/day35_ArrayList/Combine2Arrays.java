package day35_ArrayList;

import java.util.ArrayList;

public class Combine2Arrays {

    public static void main(String[] args) {

        String[] g1={"qq","aa","sss"};
        String[] g2={"qq1","aa1","sss1"};

        ArrayList<String> al= new ArrayList<>();

         for (String a:g1) {
            al.add(a);
        }

        for (String a:g2) {
            al.add(a);
        }

        System.out.println(al);//also use al.toString()
        System.out.println(al.toString());

    }
}
