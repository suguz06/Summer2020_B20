package Office_Hours.Practice_09_16_2020;


//import java.lang.Exception; //no need=> implicitly works=> auto loaded

public class ExceptionsTypes {

    public static void main(String[] args) {

        //System.out.println("Cybertek".charAt(200)); //Compiler happy this=>> unchecked exception
     // unexpected exp=> you can run your code




      //  Thread.sleep(3000); // compiler complains it=> this is checked execptions

 // checked=> you can not run=> you can handle immediately

//Selenium => all execption=> unchecked type


       try { // permannet solution for checked or unchecked execption
           System.out.println(9/0); //expection code
       } catch ( // no sibling here==> self exp or Parent execption needed
               //ArithmeticException e) // use this or parent=> RuntimeEx
           //RuntimeException e) => OR more general Exception solves everything
        Exception e)
           {
           System.out.println(e.getMessage()); // exception message
       }

        System.out.println("test continue");

       try {
           Thread.sleep(2000);
       }
//       catch (RuntimeException e){ // Child to Parent class ORDER !!
//           System.out.println(e.getMessage());
//       }
       catch (InterruptedException a){
           System.out.println(a.getMessage());
           System.out.println("Exception handliging");
       }
        System.out.println("Test 2");

        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException a){ //Multi catch block=> family does not placed before the child
            System.out.println(a.getMessage());
            System.out.println("Exception handliging");
        }
       catch (RuntimeException e){ // Child to Parent class ORDER !!
           System.out.println(e.getMessage());
       }
        System.out.println("Test 3");


        System.out.println("===========");

        int [] arr={1,2,3};

      try {
          System.out.println(arr[100]);
      }  catch (RuntimeException e){
          System.out.println("Exception handled:  " + e.getMessage());
      }finally { // Interview QUESTION=> FINALLY is a block to final try&catch block ( final plan)
          // ) => Final is a keyword for variable, method and class
          System.out.println("Final block always executed");
      }

    }
}
