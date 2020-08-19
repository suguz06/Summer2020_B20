package day43_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock3 {

static ArrayList<Integer> al=new ArrayList<>();
static int[] ar=new int[7];
    static int a;
    static int b;
    static int c;

    static {
        a=100;
       b=200;
         c=300;
         ar[0]=1;
         ar[1]=2;
         al.addAll(Arrays.asList(10,20,30,40,50));
    }

//    public static void main(String[] args) {
//        a=100;
//        b=200;
//        c=300;
//
//    }


}
