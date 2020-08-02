package day33_LocalDateTime;

import java.util.Arrays;

public class OverLoading {

    public static void main(String... m) { //String... same as Sting[]
        System.out.println("String array");
        int [] a={1,2,3};
        main(a);
    }


    //overloading main method

    public static void main(int[] kfc) {
        System.out.println("int array");
    }

    public static void main(double[] bro) {
        System.out.println("double array");


    }




}
