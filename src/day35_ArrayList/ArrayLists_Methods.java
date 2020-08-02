package day35_ArrayList;

import java.util.ArrayList;

public class ArrayLists_Methods {

    public static void main(String[] args) {

        ArrayList<String > earlyBirds=new ArrayList<>();


        earlyBirds.add("Ali");
        earlyBirds.add("Veli");
        earlyBirds.add("Deli");
        earlyBirds.add("Zeli");
        earlyBirds.add("Keli");
        earlyBirds.add("Peli");
        System.out.println(earlyBirds);
        //set() does not change size
        // set() => is updated method at specific index and newElement
        earlyBirds.set(0,"Kedi"); earlyBirds.set(1,"Pepi");
        System.out.println(earlyBirds);

        earlyBirds.remove(1);
        System.out.println(earlyBirds);
//        //clear(_) ==>> remove all list==> gives empty list
//        earlyBirds.clear();
//        System.out.println(earlyBirds);


        System.out.println("===============");

        ArrayList<Integer> list=new ArrayList<>();

        list.add(1); list.add(2); list.add(3);
        list.add(4); list.add(5); list.add(6);

        System.out.println(list);
      //remove(int index==>primitive int)  remove the specofic index elements
        list.remove(0);
        list.remove(0);

        //note => size is decreasing 1 every remove steps

        System.out.println(list);


        //remove() => first matching element is removed
        // remove(Object) ==> Element is removed its own places

        Integer a=6; // a is now object==> it is removed 6 from list
        list.remove(a);
        System.out.println(list);
    }
}
