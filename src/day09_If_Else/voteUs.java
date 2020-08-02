package day09_If_Else;

public class voteUs {
    public static void main(String[] args) {


        int age=15;
        boolean usCitizen= true;

        if (age>= 18 && usCitizen) {
            System.out.println("Eligible for vote");
        }
        else {
            System.out.println("not eligible");
        }
    }
}
