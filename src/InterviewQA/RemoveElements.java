package InterviewQA;


import java.util.ArrayList;
import java.util.Arrays;

/*
Given a list of Integers 1, 2, 3, 4, 5, 6 ....300 etc. remove all values
greater than 100.

 */
public class RemoveElements {

    public static void main(String[] args) {




        ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(112,2,100,105,300,300,300 ,12));

//        for (Integer i = 0; i <=300 ; i++) {
//            list.add(i);
//
//        }
//        ArrayList<Integer> list1= new ArrayList<>();
//       list1.addAll(Arrays.asList(1,2,3));

       // list.removeIf(p-> p>100);
       // list.removeAll(Arrays.asList(112,105,300));
        Integer a=300;
        list.remove(a);

        System.out.println("list = " + list);
    }
}
