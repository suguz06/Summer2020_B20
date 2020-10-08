package Office_Hours.Practices_10_07_2020;

import java.util.*;

//no duplicates
public class SetPractice { // set does not have index number => exp=> not work .get(2);

    public static void main(String[] args) {

        String str = null;
        // System.out.println(str.toUpperCase()); //null is not a object insatce
//nullPointerExecption

        String[] names = {null, "Davud", "Selman", "Aslan","Aslan", "Aslan"};
        String[] names1 = {  "Davud", "Selman", "Aslan","Aslan", "Aslan"};


        Set<String> hashSet = new HashSet<>(); //Polymorhism
        hashSet.addAll(Arrays.asList(names)); //sometimes NO SORTED -> NOT ALL THE TIME SORTED
        System.out.println("hashSet "+ hashSet); //RANDOM ORDER


        Set<String> linkedHashSet = new LinkedHashSet<>(); //ALWAYS KEEP INSERTION ORDER
        linkedHashSet.addAll(Arrays.asList(names));
        System.out.println("linkedHashSet = " + linkedHashSet);

        Set<String> treeSet = new TreeSet<>(); // ALL THE TIME SORTED

        //NUll is not accepted by TreeSet class
        //treeSet.addAll(Arrays.asList(names)); //NullPointerException
        //System.out.println(treeSet); //NullPointerException

        treeSet.addAll(Arrays.asList(names1));
         System.out.println(treeSet);

    }


}
