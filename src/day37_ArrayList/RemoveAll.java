package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {

    public static void main(String[] args) {

        ArrayList<Integer> nums= new ArrayList<>();

        nums.addAll(Arrays.asList(1,1,3,4,2,3,4,5,1,22));
        System.out.println(nums);

// removeAll() ==> remove all match elements
        //remove 1,2,5

       nums.removeAll(Arrays.asList(1));
//        Integer a=1;
//        nums.remove(a);


        System.out.println(nums);


        System.out.println("================");

        ArrayList <Integer> num1=new ArrayList<>();
        num1.addAll(Arrays.asList(1,2,3,5,56,7,53,2,5,6,3));

        System.out.println(num1);

        //only keeps the elements 1,2 or 3

        num1.retainAll(Arrays.asList(1,2,3,9,7));

        //retainAll()  => keeps the macthing elements OR remove non-matching

        System.out.println(num1);

        //interview question=>  write a programme that  can remove all the names of Ahmet

        System.out.println("===================");

        ArrayList<String> employeNames= new ArrayList<>();

        employeNames.addAll(Arrays.asList("Ahmed", "Ali","Ahmed" , "John","Sara", "Jack", "Ahmed"));
        System.out.println(employeNames);
        employeNames.removeAll(Arrays.asList("Ahmed"));
        System.out.println(employeNames);

//retainAll()  => remove non-matching elements OR just list macthing elements



        ArrayList<String> employeNames1= new ArrayList<>();

        employeNames1.addAll(Arrays.asList("Ahmed", "Ali","Ahmed" , "John","Sara", "Jack", "Ahmed"));
        System.out.println(employeNames1);
        employeNames1.retainAll(Arrays.asList("Ahmed", "Dawud"));
        System.out.println(employeNames1);



    }
}
