package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorPractice2 {


    public static void main(String[] args) {

        String[] arr = {"Roman", "Ahmet", "Abzal", "Nurbiye", "Roman", "Ahmet", "Abzal", "Nurbiye", "Roman", "Abzal", "Ahmet"};


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(arr));

        //remove all "Ahmet"

        //1- Iterator

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            if (it.next().equals("Ahmet")) it.remove();
        }

        System.out.println(names);


        System.out.println("====================");
        //2- for loop => manually do remove


        ArrayList<String> employee = new ArrayList<>(Arrays.asList(arr));

        for (Iterator<String> i = employee.iterator(); i.hasNext(); ) {
            if (i.next().equals("Ahmet")) {
                i.remove();
            }
        }

        System.out.println(employee);

        System.out.println("====================");

        // 3. for removeIf and lambda expresssion

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));

        list.removeIf(p -> p.equals("Ahmet")); //internally use the iterator
//implicitly done it removeIf

        System.out.println(list);


    }
}
