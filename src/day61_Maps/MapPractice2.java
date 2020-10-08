package day61_Maps;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class MapPractice2 {


    /*

create a map that can contain student name and score
        put 5 of your class mates names and thier score
        print out the name of students who made less than 80

     */


    public static void main(String[] args) {

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();

        students.put("Ali", 90);
        students.put("Ali1", 90);
        students.put("Ali7", 99);
        students.put("Ali3", 90);
        students.put("Ali4", 70);
        students.put("Ali", 90);
        students.put("Ali6", 95);
        students.put("Ali2", 85);
        students.put("Ali3", 90);
        students.put("Ali5", 100);

        LinkedHashMap<String, Integer> earlyBirds = new LinkedHashMap<>(); //score>=95

        LinkedHashMap<String, Integer> angryBirds = new LinkedHashMap<>(); //score<95


        List<String> eaelyBirdList=new ArrayList<>();



        for (String each : students.keySet()) {
            Integer eachValues = students.get(each);
//            System.out.println(each + " :  " + eachValues);
//            if (eachValues >=95) {
//                earlyBirds.put(each, eachValues);
//
//            } else {
//                angryBirds.put(each, eachValues);
//            }

            if (eachValues>=95) {
                eaelyBirdList.add(each);
            }
        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);

        System.out.println(eaelyBirdList);


    }
}
