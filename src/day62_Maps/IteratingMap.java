package day62_Maps;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IteratingMap {

    public static void main(String[] args) {
        Map<String, LocalDate> map=new LinkedHashMap<>();

        map.put("John",LocalDate.of(1999, 1, 5));
        map.put("Aaron",LocalDate.of(1998, 2, 12));
        map.put("Daniel",LocalDate.of(1997, 7, 15));
        map.put("Caleb",LocalDate.of(1996, 9, 10));
        map.put("Eric",LocalDate.of(1995, 6, 3));


        System.out.println(map);



        for (String each : map.keySet()) { //we can not find second element=> since no index in the set
            System.out.println(each+ " : "+map.get(each)); //but we use list=> add list this set elements
        } //also get value of key


        List<String> name=new ArrayList<>(map.keySet()); //constructor accept Collection type
        System.out.println(name);
        System.out.println(name.get(1));

        System.out.println("================");

        for (LocalDate each : map.values()) {
            System.out.println(each);

        }

        List<LocalDate> dateOfBirth=new ArrayList<>(map.values());
        System.out.println(dateOfBirth);
        System.out.println(dateOfBirth.get(1));


        System.out.println("========================");
        // key and value iterate together

        for (Map.Entry<String, LocalDate> each : map.entrySet()) { //keys and values same time
         // OR   System.out.println(each.getKey()+ " : "+ each.getValue());
            System.out.println(each.getValue()+ " : "+ each.getKey());
        }


    }



}
