package day61_Maps;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IteratingKeysValues {

    public static void main(String[] args) {
//LinkedHashMap is not sorted=> as insertion order as it is

        Map<String, LocalDate> students=new TreeMap<>(); //sorted alphabetical of KEYS
        students.put("Hasan", LocalDate.of(1985, 2, 2));
        students.put("Hasan1", LocalDate.of(1964, 3, 2));
        students.put("Hasan2", LocalDate.of(1974, 3, 2));
        students.put("Hasan3", LocalDate.of(1994, 3, 2));
        students.put("Hasan3", LocalDate.of(1954, 3, 2));
        students.put("John", LocalDate.of(1999, 3, 2));




        System.out.println(students);


        Set<String > keys=students.keySet();


        //appllying loops to the keys
        for (String each : students.keySet()) {
            System.out.println("each = " + each);


        }

        System.out.println("============");
        //applying loops to the values
        for (LocalDate each : students.values()) {
            System.out.println("each = " + each);


        }



    }
}
