package day38_JavaRecap;

import sun.security.krb5.internal.crypto.Aes128;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionPractices {

    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>();

        nums.addAll(Arrays.asList(10,25,121,-115,10,5145,541,584,-5,5,54,88));

        Integer max= Collections.max(nums);
        Integer min= Collections.min(nums);


        System.out.println("Max "+ max);
        System.out.println("Min "+ min);


        //replaceAll (CollectionType, element1, element2)

Collections.replaceAll(nums, 10, 10000);

        System.out.println(nums);
    }
}
