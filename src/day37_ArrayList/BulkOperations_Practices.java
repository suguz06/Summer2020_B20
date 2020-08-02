package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BulkOperations_Practices {

    public static void main(String[] args) {



        ArrayList<String > students=new ArrayList<>();
        students.add("ali");
        students.add("veli");
        students.add("deli");
        students.add("zeli");
        System.out.println(students);


//verfiy ali veli contain or not
        System.out.println(students.containsAll(Arrays.asList("ali","veli")));


        System.out.println("==================");

        //addAll()  =>add many elements

        ArrayList<Integer> numbers=new ArrayList<>();
        // add: 20,15,55,45
        Integer [] nums={20,15,55,45};
        numbers.addAll(Arrays.asList(nums) );

        //or

        numbers.addAll(Arrays.asList(20,15,55,45) );

        System.out.println(numbers);

        System.out.println("======");

        ArrayList <String> group7= new ArrayList<>();
        //add all group member names

        //verify your mentor and one of your closest friend are contained  in the list

        group7.addAll(Arrays.asList("ali", "veli", "deli"));
        System.out.println(group7);
System.out.println(group7.containsAll(Arrays.asList("zeki", "seli")));


    }
}
