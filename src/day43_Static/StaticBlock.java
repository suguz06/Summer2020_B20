package day43_Static;

public class StaticBlock {





    public static void main(String[] args) {
        System.out.println("Main methods");
    }


    static { // static block  =>> runs first=> run once times
        // it works even before the main block

        System.out.println("Static Block");

    }


}
