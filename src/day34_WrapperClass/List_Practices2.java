package day34_WrapperClass;

import java.util.ArrayList;

public class List_Practices2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1040);
        list.add(200);
        list.add(1140);
        list.add(100);
        list.add(1200);
        list.add(110);
        System.out.println(list);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer each : list) {
            if (each > max) max = each;
            if(each<min) min=each;
        }
        System.out.println("Max : " +max);
        System.out.println("Min : "+min);

    }
}
