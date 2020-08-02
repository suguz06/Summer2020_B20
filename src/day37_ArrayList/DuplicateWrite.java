package day37_ArrayList;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DuplicateWrite {

    public static void main(String[] args) {


        ArrayList<Integer> nums=new ArrayList<>();

        nums.addAll(Arrays.asList(1,1,2,2,2,3,5,6,6)); //output: 1 2 6

        System.out.println(nums);

        nums.removeIf(p-> Collections.frequency(nums, p) !=2);

        System.out.println(nums);

       ArrayList<Integer> nonDup1=new ArrayList<>();

       String nonDup="";
        for (Integer a:nums) {
            if(!nonDup.contains(a+"")) nonDup +=a;
        }
        nonDup1.addAll(Arrays.asList(Integer.parseInt(nonDup)));
        System.out.println(nonDup1);

    }
}
