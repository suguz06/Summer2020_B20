package day52_Exceptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {


    public static void main(String[] args) {


        int [] arr={10,20};

      try {
          System.out.println(arr[20]); //ArrayIndexOutOfBound Exception
      } catch (ArithmeticException e) {
          System.out.println("Aritmetic Exception is handled");
      } catch (ClassCastException e) {
          System.out.println("Class Cast Exception");
      }catch (ArrayIndexOutOfBoundsException e){ // child should be before
          System.out.println(" array index bound exception");
      }
      catch (IndexOutOfBoundsException e){ //parent should be after child
          System.out.println("Index out of Bond Exception");

      }catch (RuntimeException e) {
          System.out.println("Runtime Exception"); // parent of IndexOut=> ArrayOutBound=> last above 3 catch
      } // catch (NoSuchElementException e) {}// give error

        System.out.println("=================  Unckeched exception");

      String str="Cybertek";

       try {
           System.out.println(str.charAt(200)); //indexoutofBoundExcp => runtime expc
       } catch (RuntimeException e) { //Runtime exception can handle any uncheckhed exceptioon
           System.out.println("Runtime Exception:  "+ e.getMessage());
       }


        System.out.println("===================Checked Exception");



       // Thread.sleep(3000); give comlie error


        try { // exception code in try block
            Thread.sleep(3000); // 3 seconds count !!!
            System.out.println("try block");
        }catch (InterruptedException e) { //catch( Exception e)
            System.out.println("Catch block");

        }  //Parent exception handle all child exceptions
        finally {
            System.out.println("Finally block"); // always executed => handled or not
        }

        System.out.println("Completed");



    }
}
