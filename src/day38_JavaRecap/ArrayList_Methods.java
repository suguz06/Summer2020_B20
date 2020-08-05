package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_Methods {
//remove size set get equals contains clear

    public static void main(String[] args) {


        ArrayList<String > cars= new ArrayList<>();

cars.addAll(Arrays.asList("Toyota", "Mercedes", "Honda", "Kia", "BMW", "Tesla","Infinity", "WV", "Lexus", "Tesla"));

      //  Collections.replaceAll(cars, "Tesla", "");

//remove => overloaded method 1- index remove 2- object remove (non-primitive)
//tesla=> index 4
//cars.remove(4); just remove first encountered OR object name
//cars.remove("Tesla");

//cars.removeIf(p-> p.equals("Tesla"));

        System.out.println(cars);

        cars.removeIf(p-> p.toLowerCase().contains("m"));

        System.out.println(cars);

//retainAll(CollectionType)  => remove non-matching

        cars.retainAll(Arrays.asList("Tesla"));

        System.out.println(cars);


        System.out.println("===========");


        ArrayList<String> groceryList= new ArrayList<>();

        groceryList.addAll(Arrays.asList("Dragon Fruit","Eggs","Milk", "Paper Toilet", "Mango","Bread", "Orange", "Avocado"));


        System.out.println(groceryList);


        boolean b1=groceryList.contains("Coca Cola"); //false

        System.out.println(b1);

        boolean b2= groceryList.containsAll(Arrays.asList(  "Milk", "Eggs")); // true since containsAll

        System.out.println(b2);

        //set() => updated of elemnets or replace old to new
//set(index, new elements)

        groceryList.set(0, "Apple");

        groceryList.set(groceryList.indexOf("Bread"), "Water");

        System.out.println(groceryList);
    }
}
