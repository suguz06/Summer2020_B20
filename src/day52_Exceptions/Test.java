package day52_Exceptions;
// no need to import exception class==> it is autyomaticall work=> implicitly call
public class Test {


    public static void main(String[] args) {


        //System.out.println(9/0);// during runtime=> unchecked exception

        // exception find => no go further=> compiler stop to complie

       try { //exception handling => try first then catch=> get further
           System.out.println(9/0);
       } catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }


        System.out.println("Test Completed");
    }
}
