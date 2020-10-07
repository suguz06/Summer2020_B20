package day60_Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IterablePractice {


    public static void main(String[] args) {

        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,2,3,4,2,3));

        for (int i = 0; i <list1.size() ; i++) {// method true logical => but not remove

            if(list1.get(i)<5) list1.remove(i); // iterate index but not iterate the object

        }
        System.out.println(list1);

        System.out.println("====================");
        //for each loop
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,2,3,4,2,3));

//        for (Integer each : list2) { //gives error .ConcurrentModificationException
//
//            if(each<5) list2.remove(each);
//
//        }

        System.out.println(list2);

        System.out.println("=====================");
        ArrayList<Integer> list3=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,2,3,4,2,3));

        list3.removeIf(p-> p<5); // internally use iterator=> able to remove

        System.out.println(list3);

        System.out.println("=========================");

        ArrayList<Integer> list4=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,2,3,4,2,3));
// ArrayList => iterable

        Iterator<Integer> it=list4.iterator();// iterator() method=> any collection type is applicable, returns Iterator

// make sure size is bigger then zero
        //manually implemented
        while (it.hasNext()) { //hasNext() =>checks if there are enough elements to be iterated, returns boolean

            if (it.next()<5) {
                it.remove();
            }
        }


        System.out.println(list4);

        // if hasNext() true=> it access to the object, otherwise no object

        System.out.println("==============");

        ArrayList<Integer> list5=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,2,3,4,2,3));

 for (Iterator<Integer> i= list5.iterator(); i.hasNext(); ) {
     if (i.next()<5 ) { // netx() accesss the element and then remove
         //next() method retrieve (get method similar) element after hasNext is OK
         i.remove();
     }
 }

        System.out.println(list5);


    }
}
