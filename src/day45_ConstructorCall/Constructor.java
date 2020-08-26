package day45_ConstructorCall;

import java.util.ArrayList;
import java.util.Arrays;

public class Constructor {


     Constructor() {
        System.out.println("no arg constructor");
    }

    public Constructor(int a) {
        System.out.println("with int arg");

    }

    public Constructor(String str){
        System.out.println("String argument");
    }

    public static void main(String[] args) {

        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor(10);
        Constructor obj3 = new Constructor("Hello");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5));

        ArrayList<Integer> list2 = new ArrayList<>(list1);
        //list2.addAll(list1);
        System.out.println("list2 = " + list2);


    }

}
