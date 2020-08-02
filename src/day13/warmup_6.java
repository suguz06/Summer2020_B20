package day13;


import java.util.Scanner;

/*
write a program that can calculate the tax based on the annual salary
                    1. ask the user enter the annual salary
                    2. ask user to enter the full name
                    3. ask user enter marrid status (use nextBoolean() method this time)
                    assume that the normal tax rate for a person is set to 25 %.
                    if he/she is married tax rate will be set to 20%
                    the program should display all the informations in teh output

 */
public class warmup_6 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter salary: ");
        double salary = scan.nextDouble();

        scan.nextLine();
        System.out.println("enter full name: ");
        String fullName = scan.nextLine();

        System.out.println("enter married status: ");
        boolean isMarried = scan.nextBoolean();
       String taxRate=" ";

        if (isMarried) { taxRate="20%";

        } else {
            taxRate="25%";
        }
        System.out.println(fullName + " " + salary + " " + "married status" + isMarried + " tax rate: "+ taxRate);

    }
}
