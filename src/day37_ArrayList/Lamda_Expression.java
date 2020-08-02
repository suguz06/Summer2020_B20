package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lamda_Expression {

    public static void main(String[] args) {


        ArrayList<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,13,4,3,4,53,534,3,5,6));
        //remove   than 5  NOTE: remove not working loop
        System.out.println(list);


       // Predicate<Integer> lessThan5=each -> each<5;  // by definig Predicate

       // list.removeIf(lessThan5);

        list.removeIf(p-> p<5);   // by using lambda expresssion and predacate
        System.out.println(list);


        System.out.println("===========");

        Predicate<Integer> oddNumber= p-> p %2 !=0;

        list.removeIf(oddNumber);
        System.out.println(list);
        System.out.println("====================");

        ArrayList<Integer> numm=new ArrayList<>();
        for (int i=0; i<=100; ++i) {
            numm.add(i);
        }

        System.out.println(numm);

        System.out.println(numm.removeIf(p-> p%2 !=0));
        System.out.println(numm);

        numm.removeIf(p-> p%3==0);

        System.out.println(numm);

        numm.removeIf(p-> p%5==0);

        System.out.println(numm);
    }
}
