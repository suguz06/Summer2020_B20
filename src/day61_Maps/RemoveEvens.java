package day61_Maps;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveEvens {

    public static void main(String[] args) {


        Integer[] num = {11, 112, 45, 54, 1, 65, 45, 54, 21, 21, 15};

        Set<Integer> set = new LinkedHashSet<>();

        set.addAll(Arrays.asList(num));

        System.out.println("set = " + set);


        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            Integer each = it.next();
            if (each % 2 == 0) {
                it.remove();
            }
        }

        System.out.println("set removed even = " + set);

    }
}
