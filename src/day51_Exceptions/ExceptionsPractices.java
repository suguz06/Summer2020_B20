package day51_Exceptions;
import Library.Util;
import Library.Util.*;

public class ExceptionsPractices {

    public static void main(String[] args) {
        System.out.println("Hello");

/*
        try {
            Thread.sleep(3000); // 1 second is 1000 miliseconds
        } catch (InterruptedException e) {

        } */


        Util.sleep(3);
        System.out.println("World");

       /* try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        } */

        System.out.println("How are you?");
    }


    /// we create as Util package method=>> just static to call outside the class
    // call method==> by using class name

//    public static void sleep(int seconds) {
//
//        try {
//            Thread.sleep(seconds * 1000);
//        } catch (InterruptedException e) {
//
//        }

    }


