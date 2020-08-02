package Office_Hours.Practice_06_17_2020;

public class Switch_Browser {


    /*
     write a program that can display the selected browser
                1. declear a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers' names, output should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task
     */
    public static void main(String[] args) {
        String browserName = "Chrome";

        switch (browserName) {

            case "chrome":
            case "Chrome":
                System.out.println("opening Chrome");
                break;
            case "firefox":
            case "Firefox":
                System.out.println("opening firefox");
                break;
            case "safari":
            case "Safari":
                System.out.println("opening safari");
                break;
            default:
                System.out.println("invalid");

        }
    }


}
