package day52_Exceptions;

public class ThrowsPractice {


    public static void main(String[] args) throws InterruptedException {
        // throws solve temporarly
        m1(); //gives error
        m2(); //gives error
        m3(); //no error
        m4(); // no error
    }

    public static void m1() throws InterruptedException{
        Thread.sleep(3000);
    } // advantage=> easy to read => disadvantage=> temporary soltion

    public static void m2() throws  InterruptedException{
        m1(); //gives error since, temporary
    }

    /// above methods still have problems since temporary solutions

    public static void m3(){

       try {
        m2(); //gives error
    }catch (InterruptedException e){

       } }


       public static void m4(){
        m3(); // no errors gives => since try catch solve exception permanently
       }

    // if we use many times=> we write a custom method=> just one times => use throws


}
