package day32_OverloadMethods;

import java.util.Arrays;

public class MethodOverLoading {


    public static void main(String[] args) {
        int [] arr={1,35,7};
        Arrays.sort(arr); //sort  method works also String

        String [] names={"a", "D", "R"};
        Arrays.sort(names); // sort method works also String
    }

    public static void method(int a) {

    }

    public static void method(double a) {

    }

}
