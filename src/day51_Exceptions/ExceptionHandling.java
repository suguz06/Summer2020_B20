package day51_Exceptions;


// try and catch block==> to handle exceptions
/*
try{
exception statement
}
cacth(Exception Class element) {
statements // not mandatory
}

 */

import java.util.ArrayList;

public class ExceptionHandling {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(); // empty ==> no get 1 or 2 elemmnt
        String exceptionMessage = "";

        try {
            System.out.println(list.get(1)); //no second index element // unchecked expection
        } catch (IndexOutOfBoundsException e) {
            exceptionMessage= e.getMessage();
        }

        System.out.println(exceptionMessage);


        System.out.println("next step");


    }
}
