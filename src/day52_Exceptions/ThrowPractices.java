package day52_Exceptions;




import java.time.LocalTime;

public class ThrowPractices {

    public static void main(String[] args) {


        String driverName="chrome"; /// unchecked exception=> use Runtime exception

        if(driverName.equals("chrome")) {
            System.out.println("set up chrome");
        } else if (driverName.equals("firefox")) {
            System.out.println("set up firefox");
        } else if (driverName.equals("opera")){
            System.out.println("set up opera");
        }else {
            throw new  RuntimeException("Invalid browser name");
         }


        System.out.println("==================");

        if (LocalTime.now().getMinute()==45){
            throw new RuntimeException("it is break time exception");
           // System.out.println("unreachable"); // just one trow=> stop entire execption
        } else {
            System.out.println("Continue");
        }

        throw new ArithmeticException(); // just manually throw exception
       // throw new RuntimeException(); //gives an error => stop execution
      //  System.out.println("Hello");


    }

}
