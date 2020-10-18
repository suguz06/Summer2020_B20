package day62_Maps;

import java.time.LocalDate;
import java.util.*;

public class ListOfMaps2 {

    public static void main(String[] args) {
        String[] friends={"Ali1","Veli1","Zeki1"};
        LocalDate [] DOBFriends={LocalDate.of(2000, 4, 2),LocalDate.of(2000, 4, 2),LocalDate.of(2000, 4, 2)};

        String[] classMates={"Ali2","Veli2","Zeki2"};
        LocalDate [] DOBClassMates={LocalDate.of(2000, 4, 2),LocalDate.of(2000, 4, 2),LocalDate.of(2000, 4, 2)};

        String[] family={"Ali3","Veli3","Zeki3"};
        LocalDate [] DOBFamily={LocalDate.of(2000, 4, 2),LocalDate.of(2000, 4, 2),LocalDate.of(2000, 4, 2)};

        List<Map<String, LocalDate>> list= new ArrayList<>();
        list.addAll(Arrays.asList(
                new LinkedHashMap<>(),
                new LinkedHashMap<>(),
                new LinkedHashMap<>()
        ));

        System.out.println(list);

        Map<String, LocalDate> map1 = list.get(0);

        for (int i = 0; i <friends.length ; i++) {
            map1.put(friends[i],DOBFriends[i]);

        }
        System.out.println(map1);


        Map<String, LocalDate> map2 = list.get(1);

        for (int i = 0; i <classMates.length ; i++) {
            map2.put(classMates[i],DOBClassMates[i]);

        }
        System.out.println(map2);

        Map<String, LocalDate> map3 = list.get(2);

        for (int i = 0; i <family.length ; i++) {
            map3.put(family[i],DOBFamily[i]);

        }
        System.out.println(map3);

        System.out.println(list);
    }
}
