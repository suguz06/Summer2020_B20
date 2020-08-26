package day45_ConstructorCall;

import java.util.ArrayList;
import java.util.Arrays;


/*
  create a class called ShoppingList
                create 5 objects of Item and store them into List of Items
                calculate the total cost of all Items in the list
 */
public class ShoppingList {

    public static void main(String[] args) {



    Item item1=new Item("Egg", 1.25, 10);
    Item item2=new Item("Water", 0.25, 10);
    Item item3=new Item("Cheese", 2.25, 3);
    Item item4=new Item("Apple", 1.35, 10);
    Item item5=new Item("Butter", 1.25, 4);

   ArrayList<Item> list=new ArrayList<>();

   list.addAll(Arrays.asList(item1,item2,item3,item4,item5));

        System.out.println("list = " + list.get(0));

        double total=0;

   for (Item each: list) {
       total +=each.calCost();
   }

        System.out.println("total = " + total);


        System.out.println("=================");

        Item[] arr={item1,item2, item3, item4,item5};

        double total1=0;
//        for (Item each: arr) {
//            total1 +=each.calCost();
//        }

        for(int i=0; i<arr.length; ++i){
            total1 += arr[i].calCost();
        }
        System.out.println("total1 = " + total1);


    }}
