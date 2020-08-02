package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Practices {

    public static void main(String[] args) {


        ArrayList<Integer> nums= new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,1,23,4,3,2,4,54,32,4,3,2,2,4,56,2));

        ///remove numbers less than 5
//        for(int i=0; i<nums.size(); ++i) {
//            if(nums.get(i)<5) nums.remove(i);
//        }

        System.out.println(nums);
    }
}
