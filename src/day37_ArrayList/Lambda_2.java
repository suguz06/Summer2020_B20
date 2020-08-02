package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda_2 {

    public static void main(String[] args) {


        ArrayList<String > names= new ArrayList<>();
        names.addAll(Arrays.asList("Mary", "Monica", "Mahmut", "Masha", "Ali","Hasan"));

        System.out.println(names);

        names.removeIf(p -> p.startsWith("M") && p.endsWith("y"));

        System.out.println(names);
    }
}
