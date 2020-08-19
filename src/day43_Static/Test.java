package day43_Static;

import java.util.Arrays;

import static Library.Resources.a;
import static Library.Resources.method1;// static import

import static Library.Resources.*; // regular import==>> imports all class member


public class Test {

    public static void main(String[] args) {

        System.out.println(StaticBlock3.a);
        System.out.println(StaticBlock3.b);
        System.out.println(StaticBlock3.c);
        System.out.println(StaticBlock3.al);

        System.out.println(Arrays.toString(StaticBlock3.ar));

        System.out.println(Arrays.toString(Data.arr));
        System.out.println(Data.list);


        System.out.println("=================");

        System.out.println(a);

        method1();

    }
}
