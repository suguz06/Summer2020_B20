package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice3 {

    public static void main(String[] args) {

        Map<String , String> countries=new LinkedHashMap<>();

        countries.put("East Turkistan", "Kashgar");
        countries.put("Uzbekistan", "Tashkent");
        countries.put("Spain", "Madrid");
        countries.put("USA", "DC");
        countries.put("Turkey", "Ankara");
        countries.put("East Turkistan", "Kashgar");
        countries.put("Uzbekistan", "Tashkent");
        countries.put("Kyrgyzstan","Bishkek");

        //country name is : country name, capital city is

        for (String eachCountry : countries.keySet()) {
            String eachCity=countries.get(eachCountry);

            System.out.println(  eachCountry+ "'s  Capital city:  "+ eachCity );

        }




    }
}
