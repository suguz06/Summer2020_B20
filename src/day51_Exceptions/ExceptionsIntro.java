package day51_Exceptions;

public class ExceptionsIntro {
// 2 types execptions 1- checked (complie, before compile u see errors points) 2- unchecked or un expected event (after compile u see errors or exceptions)
    public static void main(String[] args) {

        int [] arr={1,2,3};  // it compiles but


        System.out.println("Test Started");
        System.out.println(arr[100]); //unchecked or unexpected exception event


 // Thread.sleep(3000); //checked exceptions (unwanted event )

        String str="Cybertek";
        System.out.println(str.charAt(-1)); //uncheck we see during run time

        System.out.println("step2"); // step2 does not print since above exception

    }
}
