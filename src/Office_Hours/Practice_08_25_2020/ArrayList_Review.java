package Office_Hours.Practice_08_25_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Review {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.addAll(list);
        System.out.println(list);

        Integer[] nums = {1, 2, 3};

        list.addAll(Arrays.asList(nums));

        list.addAll(Arrays.asList(5, 6, 7));
        System.out.println(list);
        Integer a = 90;
        System.out.println(list.remove(a));

        System.out.println(list.remove(new Integer(10)));
    }
}
