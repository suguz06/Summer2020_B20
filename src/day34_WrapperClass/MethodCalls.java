package day34_WrapperClass;
import Library.Util;

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {

        Integer [] a={1,2,3};
        Integer [] b={4,5,6};

        Double[] a1={2.0,3.4,4.9};

       Integer [] c= Util.combine2Arrays(a, b);
        System.out.println(Arrays.toString(c));

        System.out.println(Util.maxNum(c));
        System.out.println(Util.maxNum(a1));

        int s=Util.minNum(c); //Integer assign int=>unboxing
        System.out.println(s);

        Character[] art={'c','v','d'};

       Character[] tt= Util.sortDesc(art);

        System.out.println(Arrays.toString(tt));
    }

}
