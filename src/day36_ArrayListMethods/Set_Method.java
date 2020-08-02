package day36_ArrayListMethods;

import java.util.ArrayList;

public class Set_Method {

    public static void main(String[] args) {


        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(10);
        System.out.println(list);
        list.set(list.size()-1,0);
        System.out.println(list);


        System.out.println("=============");

        ArrayList<Integer> list2=new ArrayList<>();
        for(int i=1; i<=20; ++i){
            list2.add(i);
        }
        System.out.println(list2);

        for(int i=0; i<list2.size()-1; ++i){
          Integer a=  list2.get(i);
           if( a %2 !=0 )  {
               list2.set(i,  a*2);
            } else list2.set(i,3*a);
        }
        System.out.println(list2);


    }
}
