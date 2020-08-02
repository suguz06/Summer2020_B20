package day19_For_Loop;


// break statement works for swicth and loops

// check top to bottom execution, print first or later is important
public class BreakStatement {
    public static void main(String[] args) {

        for (int i = 1; i <= 15; i++) {


            if (i==4) {  continue; }
            System.out.print( i+ " ");
        }

        System.out.println("===========");
        for (int i = 1; i <= 15; i++) {

            System.out.print( i+ " ");
            if (i==4) {continue; }

        }

        System.out.println("===========");


/*

note if(true) break; ==>> gives an error
 */

      //  if(true) {break;} ==> compile error break inside swicth
        //or loop


    }
}
