package day53_finalKeyword;

import Office_Hours.Practice_09_09_2020.Samsung;

public class InvalidBrowserNameException extends RuntimeException {

    public InvalidBrowserNameException() {
        super("Invalid Browser Name");
    }

    public InvalidBrowserNameException(String message) {
        super(message);

        System.err.println("Are you kidding");
    }
}


class Test2{

    public static void main(String[] args) {

        String name="safari1";

       // throw new InvalidBrowserNameException();

        //throw new InvalidBrowserNameException("Invalid Browser" +name);
// we can not add String arg=> since no constructor => default no agr constructor

  //throw new RuntimeException("Invalid Browser: " +name); //RuntimeExecption accepts string arg


        switch (name.toLowerCase()){

            case  "chrome":
                System.out.println("Chrome is selected"); break;
            case "firefox":
                System.out.println("Firefox is selected"); break;

            case "safari":
                System.out.println("Safari is selected"); break;

            default:
                throw new InvalidBrowserNameException("Please enter a valid browser name");
               // throw new  RuntimeException(); it is general case => what went wrong is not clear => you give custom exception class

        }


} }