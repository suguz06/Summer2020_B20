package day13;

import java.util.Scanner;


/*
write a program that can caluclate
the garade of the student based on the given score
                    90 <= score <= 100 ==> Excellent
                    80 <= score <= 89 ==> Great
                    70 <= score <= 79 ==> Good
                    60 <= score <= 69 ==> Passed
                    0 <= score <= 59 ==> Failed
                    other == > Invalid Entry
            MUST use Scanner and nested IF
 */
public class warmup_5 {

    public static void main(String[] args) {

        String result = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your score: ");

        int score = scan.nextInt();

        if (score >= 0 && score <= 100) {
            if (score >= 90 && score <= 100) {result ="Excellent";}
            else if (score >= 80 && score <= 89) {result ="Great";}
            else if   (score >= 70 && score <= 79) {result ="Good";}
            else if   (score >= 60 && score <= 69) {result ="Passed";}
            else if (score >=  0 && score <= 59){ result= "Failed";}
        } else {
            result = "invalid Entry";
        }

        System.out.println(result);
    }

}



