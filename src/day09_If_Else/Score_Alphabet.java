package day09_If_Else;

import java.util.Scanner;

public class Score_Alphabet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int grade = sc.nextInt();

        if (grade >=  90 && grade<= 100) {
            System.out.println("Your grade is A");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("Your grade is B");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("Your grade is C");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("Your grade is D");
        } else if (grade < 60 && grade>=0) {
            System.out.println("Your grade is F");
        }else {
            System.out.println("Please give correct grade");
        }



    }
}
