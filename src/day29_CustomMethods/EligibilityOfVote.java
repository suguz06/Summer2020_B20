package day29_CustomMethods;

import com.sun.deploy.security.SelectableSecurityManager;

public class EligibilityOfVote {


    public static void eligibleToAlcohol(boolean hasID, int age) {

        if (hasID && age >= 21) {
            System.out.println(" You are eligible to buy an alcohol");
        } else {
            System.out.println(" You are eligible to buy a milk");
        }

    }


    public static void main(String[] args) {
        vote("Selman", 24, true, "Obama");
        vote("Dan", 17, true, "Biden");
        eligibleToAlcohol(true, 19);
        eligibleToAlcohol(true, 21);
    }

    /*
    name, citizen, age
     */

    public static void vote(String name, int age, boolean citizen, String candidateName) {

        boolean eligibleToVote = age >= 18 && citizen == true;

        if (eligibleToVote) {
            System.out.println(name +
                    " is eligible to vote for " + candidateName);
        } else {
            System.out.println(name + " is not eligible for " + candidateName);
        }


    }
}