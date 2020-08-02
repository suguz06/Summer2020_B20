package day34_WrapperClass;

import java.util.Arrays;

public class WrapperClass {

    public static void main(String[] args) {


        Integer  num=100;
        int a=100;

        byte t=100;
        short ss=200;
        int z=t;

        //Integer z2=t; not works

        Byte tt=100;
        int zz=tt; //it works

        Double[] aa=new Double[3];
        System.out.println(Arrays.toString(aa));

        int p1=100;
        Integer p2=p1; //Autoboxing, authomatically

        Integer q1=300;
        int q2=q1; //unboxing, implicitly


       // Double r1=2; wrapper class is only decicated its primitives =. double
       Double r1=2.0;
        double r2=r1; //class asign to primitive==> unboxing=>implictly

        long l1=400;
        Long l2=l1; // primitive to class=> autoboxing

Float f1=100.5f;
Float f2=f1; //no auto no unboxing



        Double[] ar={1.5,3.0,99.9};
        for (double i:ar) {
            System.out.println(i);
        }
    }
}
