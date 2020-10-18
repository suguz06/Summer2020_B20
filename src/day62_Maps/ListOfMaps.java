package day62_Maps;

import java.util.*;

public class ListOfMaps {

    public static void main(String[] args) {

        Map<String,String> scrum1 = new LinkedHashMap<>();
        scrum1.put("Azat","Senior SoftwareDeveloper");
        scrum1.put("Nurahmet","SDET");
        scrum1.put("Arman","QA");
        scrum1.put("Abide","SDET");
        scrum1.put("Jeniffer","BA");

        Map<String,String> scrum2 = new LinkedHashMap<>();
        scrum2 .put("Muhtar","Senior SoftwareDeveloper");
        scrum2 .put("Fatime M","SDET");
        scrum2 .put("Arzu","QA");
        scrum2 .put("Bahtiyar","SDET");
        scrum2 .put("Romina","BA");

        Map<String,String> scrum3 = new LinkedHashMap<>();
        scrum3.put("Imran","Senior SoftwareDeveloper");
        scrum3.put("Dilfinar","SDET");
        scrum3.put("Atilla","QA");
        scrum3.put("Aidana","SDET");
        scrum3.put("Kamran","BA");

        List<Map<String,String>> teams=  Arrays.asList(scrum1, scrum2, scrum3);
       // OR  List<Map<String,String>> teams1=  new ArrayList<>(Arrays.asList(scrum1, scrum2, scrum3));
  //OR addALl is works also
        System.out.println(teams);

        for (Map<String, String> each : teams) {// looping each map in the list
            System.out.println(each);

            for (Map.Entry<String, String> each1 : each.entrySet()) {
                String names = each1.getKey();
                String jobTitle = each1.getValue();
                if (jobTitle.equals("SDET")){
                    System.out.println(names);
                }
            }
        }

    }
}
