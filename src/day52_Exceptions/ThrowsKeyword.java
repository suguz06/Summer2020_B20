package day52_Exceptions;

public class ThrowsKeyword {

//throws keyword
// =>caller of the temporary solution of exception=> by pass soluton
// => must be used in the method signature
    public static void main(String[] args) throws InterruptedException {
      //  method1(); gives error=> since you can not solve issue
        method2(); // ok works since solved in try catch

        //method3(); gives error

        Thread.sleep(3000);
    }


    public static void method1( ) throws InterruptedException{
        // cheap method=>not solve exception=? temproriliy fixed
        Thread.sleep( 1000); // gives exception=> 1 way try&catch 2-Throws
    } //ignored temprorily



    public static  void method2(){ // handling solve this => permanent solve
       try {
           Thread.sleep(3000);
       } catch (InterruptedException e) {

       }
    }

    public static void method3() throws  InterruptedException{ //cheap way exception, by pass solution
       // method1(); gives errror again
        method1();
    }
}
