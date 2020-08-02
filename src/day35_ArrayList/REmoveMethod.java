package day35_ArrayList;

import java.util.ArrayList;

public class REmoveMethod {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Ali");
        list.add("Veli");
        list.add("Deli");
        list.add("Zeli");
        list.add("Keli");

        System.out.println(list);

        list.remove(0); // remove index=2 element
        System.out.println(list);

        boolean a = list.remove("veli"); //remove first object in list
        System.out.println(list);
        System.out.println(a);
       boolean b= list.remove("Musa");
        //removed(object) ==>returns boolean ==> if removed gives true , if not gives false
       System.out.println(b);


        System.out.println("==============");
        System.out.println(list);

       String aaa= list.remove(0);
        String  y=list.remove(0);

        System.out.println(aaa);
        System.out.println(y);
        System.out.println(list);
    }
}
