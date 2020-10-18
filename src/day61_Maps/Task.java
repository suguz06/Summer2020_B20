package day61_Maps;

import java.util.*;

public class Task {

    /*
    Warmup tasks:
    1. cretea 3 LinkedHashMaps that contains employee name and jobTitle
    2. create a List of Map and store all LinkedHashMaps objects into the list.
    3. Iterate each objects from the list andprint out the name of the employee if the jobTitle of the employee is SDET
     */


    public static void main(String[] args) {
        LinkedHashMap<String, String> team1 = new LinkedHashMap<>();
        team1.put("Ali1", "SDET");
        team1.put("Veli1", "QA");
        team1.put("Seli1", "SDET");

        LinkedHashMap<String, String> team2 = new LinkedHashMap<>();
        team2.put("Ali2", "SDET");
        team2.put("Veli2", "QA");
        team2.put("Seli2", "QA");

        LinkedHashMap<String, String> team3 = new LinkedHashMap<>();
        team3.put("Ali3", "SDET");
        team3.put("Veli3", "SDET");
        team3.put("Seli3", "QA");

        List<Map> listMap = new ArrayList<>(Arrays.asList(team1, team2, team3));

        for (Map<String, String> eachTeam : listMap) {// list of maps
            for (String name : eachTeam.keySet()) { //names of each team members
                if (eachTeam.get(name).equalsIgnoreCase("SDET")) { //name(values) == SDET
                    System.out.println(name);
                }
            }
        }
    }

//
//        for (Map<String, String> eachList : listMap) {
//            for
//            (String eachKey : eachList.keySet()) {
//                String eachValue = eachList.get(eachKey);​if (eachValue.equals("SDET")) {
//                    System.out.println(eachKey);
//                }
//            }
//        }


//        for (Map map : listMap) {
//          if(map.values().equals("SDET")) {
//              System.out.println(map.keySet());
//          }
//        }

//        Iterator<Map> it = listMap.iterator();
//
//        while (it.hasNext()) {
//
//
//            Collection values = it.next().values();
//
//            for (Object value : values) {
//                if(!value.equals("SDET")) {
//                    it.remove();
//                }
//            }
//
//
//
//        }
//
//        System.out.println(listMap);



}

