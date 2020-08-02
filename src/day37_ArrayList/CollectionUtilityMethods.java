package day37_ArrayList;
/*
Collections.max
Collections.min()
Collections.replaceAll()
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtilityMethods {

    public static void main(String[] args) {

        ArrayList<Integer> nums= new ArrayList<>();
        nums.addAll(Arrays.asList(20,20,23,-56,3,22,455,-66,32,2,20,45,67,65));


       Integer max= Collections.max(nums); // max number for Collection type arrraylist
        System.out.println(max);

       Integer min= Collections.min(nums);// min number for Collection

        System.out.println(min);


        //replaceAll() ==>> all list in list as int1=> int2
        System.out.println(nums);
        Collections.replaceAll(nums, 20, 20000);
        System.out.println(nums);

        System.out.println("====================");

        ArrayList<String > names= new ArrayList<>();

        names.addAll(Arrays.asList("Ali", "Veli", "Deli", "Ali","Deli"));
        System.out.println(names);


        Collections.replaceAll(names, "Ali", "Seli");

        System.out.println(names);



    } }

