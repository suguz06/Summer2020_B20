package day51_Exceptions;

public class ExceptionHandling2 {


    public static void main(String[] args) {

        String exceptionMessage = "";

        try {
            System.out.println(10 / 0); // unchedked exception=> during runtime event
        } catch (ArithmeticException e) {
           // System.out.println(e.getMessage());
            exceptionMessage=e.getMessage();
        }

        System.out.println(exceptionMessage);
    }
}
