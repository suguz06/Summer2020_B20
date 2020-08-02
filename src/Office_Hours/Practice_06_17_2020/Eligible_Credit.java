package Office_Hours.Practice_06_17_2020;

public class Eligible_Credit {


    /*
    for the loan:
            if he/she has a job that pays > 50000$  ==> might be eligible
                    if he/she has good credit
                           if job history is more than or equal to 2 ==> then eligible
     */
    public static void main(String[] args) {

        int salary = 6000;
        int creditScore = 700;
        byte jobHistory = 2;

        if (salary > 5000) { //may be eligible
            if (creditScore > 650) {
                if (jobHistory >= 2) {
                    System.out.println("you are eligible");
                } else {
                    System.out.println("not enough history");
                }
            } else {
                System.out.println("not eligible due to credit score");
            }

        } else {
            System.out.println("need earn more than 5000");
        }


    }
}
