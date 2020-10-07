package day60_Collection;

import java.util.*;

public class SetInterface {

    public static void main(String[] args) { //object comes 3 classes
//bulk operations applied all collection types=> addAll, removeAll....

        Set<Integer> s1 = new HashSet<>(); //accept Null keyword
        s1.addAll(Arrays.asList(8, 5, 4, 3, 2, 10, 7, 1, null)); //does not keep the insertion order
        s1.addAll(Arrays.asList(8, 8, 8, 8, 8, 8, 8, 8, 8)); //does not accept duplicates

        System.out.println("HashSet " + s1);


        Set<Integer> s2 = new LinkedHashSet<>(); //accept Null keyword

        s2.addAll(Arrays.asList(8, 5, 4, 3, 2, 10, 7, 1, null));//keeps the insertion order as it is
        s1.addAll(Arrays.asList(8, 8, 8, 8)); //does not accept duplicates

        System.out.println("Linked hashSet " + s2);


        Set<Integer> s3 = new TreeSet<>(); //automatically sorted
        s3.addAll(Arrays.asList(8, 5, 4, 3, 2, 10, 7, 1)); //does not accept duplicates
        //s3.add(null); //TreeSet does not accept NULL Keywords (not instantiated element not accepted)
        System.out.println("Tree set " + s3);

        System.out.println("===============================");

        String [] arr={"A","A", "B", "B","C"};

        HashSet<String> hashSet=new HashSet<>(Arrays.asList(arr));

        System.out.println(hashSet); //[A, B, C] => it is sorted
    }
}
