package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractices {

    public static void main(String[] args) {


        Map<String, Double> employees = new LinkedHashMap<>();

        //KEY CAN NOT BE DUPLICATED=> TAKE LAST ONE TAKEN as KEY
        //BUT VALUE CAN BE DUPLICATED

        //put(key, value) => inserting the value of map
        employees.put("Elvira", 100_000.0); //wrapper class aceepts its own primitive
        employees.put("Elvira1", 120_000.0); //wrapper class aceepts its own primitive
        employees.put("Elvira2", 110_000.0); //wrapper class aceepts its own primitive
        employees.put("Elvira3", 120_000.0); //wrapper class aceepts its own primitive
        employees.put("Elvira4", 130_000.0); //wrapper class aceepts its own primitive

        System.out.println(employees);

        System.out.println("employees.size() = " + employees.size()); //returs how many pairs of data

//get(key) => key is unique -< returns the value of key
        System.out.println("Salary employees.get(\"Elvira1\") = " + employees.get("Elvira1"));

 //remove(key) => removes the pair of data

        employees.remove("Elvira1");

        System.out.println("employees = " + employees);

        //contains(key) => check it boolean
        System.out.println("employees.containsKey(\"Elvira3\") = " + employees.containsKey("Elvira3"));

        //contains(value) => check value=> returns boolean
        System.out.println("employees.containsValue(130_000.0) = " + employees.containsValue(120_000.0));

 //clear() => clear the map=> size will be zero

        employees.clear();

        System.out.println(employees.size());

        //isEmpty() => returns boolen

        System.out.println("employees.isEmpty() = " + employees.isEmpty());

   // keySet()
        //values()


    }



}
