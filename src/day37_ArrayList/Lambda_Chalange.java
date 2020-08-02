package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lambda_Chalange {
/*

program can removed elements that are not unique from ArrayList
 */

    public static void main(String[] args) {


        ArrayList<Integer> nums= new ArrayList<>();

        nums.addAll(Arrays.asList(1,3,1,11, 11, 1,3,3,4,4,5,6));

        nums.removeIf(p-> Collections.frequency(nums, p) >1);

        System.out.println(nums);

        System.out.println("============");

        ArrayList<Character> chars=new ArrayList<>();

        //chars.addAll('a','$', '3', '7','@', 'c', '&');

chars.addAll(Arrays.asList('a','$', '3', '7','@', 'c', '&'));

        System.out.println(chars);

//chars.removeIf( p-> Character.isDigit(p) && Character.isLetter(p));

chars.removeIf(p-> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(chars);
    }
}
