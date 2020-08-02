package day34_WrapperClass;

import java.util.ArrayList;

public class List_Practices {

    public static void main(String[] args) {

        ArrayList<Integer> oddList=new ArrayList<>();
        ArrayList<Integer> evenList=new ArrayList<>();

      for (int i=0; i<=100; ++i) {
          if(i%2==0) evenList.add(i);
          else oddList.add(i);
      }
        System.out.println(oddList.toString());
        System.out.println();
        System.out.println(evenList);

        int a=oddList.size();
        System.out.println( a);


        System.out.println("====");

        ArrayList<String> groceryList=new ArrayList<>();
        groceryList.add("Milk");
        groceryList.add("Butter");
        groceryList.add("Apple");
        groceryList.add("Mango");
        groceryList.add("Ice Cream");

        for(int i=groceryList.size()-1; i>=0;--i) {
            System.out.print(groceryList.get(i)+ " ");
        }
        System.out.println();

        for(String each: groceryList) {
            System.out.print(each+ " ");
        }

        System.out.println();
        int c=groceryList.size()-1;
        for(String aa: groceryList) {
            System.out.print(groceryList.get(c)+ " ");
            --c;
        }
    }
}
