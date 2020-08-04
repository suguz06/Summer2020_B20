package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class WArmUp1 {


    public static void main(String[] args) {


        String str="AABBBCCDDEEEE";

        ArrayList<String > list= new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));
        System.out.println(list);


        Arrays.asList(str.split(""));
        System.out.println(Arrays.asList(str.split("")));

    }
}
