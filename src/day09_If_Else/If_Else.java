package day09_If_Else;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        int grade = sc.nextInt();

        if (grade > 90) {
            System.out.println("Excellent");
        } else if (grade > 70 && grade < 90) {
            System.out.println("Good");
        } else if (grade > 60 && grade < 70) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


    }


}
