package day36_ArrayListMethods;

import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class Uniques {

    public static void main(String[] args) {

        ArrayList<Integer> al= new ArrayList<>(); //{1,1,2,3,3}

        al.add(1);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(3);
        al.add(99);

        ArrayList<Integer> uniq= new ArrayList<>();

        for(Integer a:al) {
            int c=0;
            for (Integer b: al) {
                if(a==b) c++;
            }if(c==1) uniq.add(a);
        }
        System.out.println(uniq);

    }
}
