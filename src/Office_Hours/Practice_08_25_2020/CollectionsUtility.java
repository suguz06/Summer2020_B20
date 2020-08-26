package Office_Hours.Practice_08_25_2020;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {


        ArrayList<Integer> list1= new ArrayList<>();
        list1.addAll(Arrays.asList(100,20,30,10,20,10));

        System.out.println(Collections.frequency(list1, 10));
Collections.swap(list1, 1, 3);

        System.out.println(list1);
        Collections.reverse(list1);

        System.out.println(list1);
        Collections.replaceAll(list1, 10, 66);
        System.out.println(list1);

        System.out.println(Collections.max(list1));
        System.out.println("Collections.min(list1) = " + Collections.min(list1));
    }
}
