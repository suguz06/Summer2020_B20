package day14_recap;

/*
ask:
1. gender (next() )
2. age (nextInt())
3. country name  ( nextLine() )
4. zipcode  ( nextInt()  )
5. full name (nextLine() )
6. full company name ( nextLine() )
 */

import java.util.Scanner;

public class Scanner_practice {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter gender");
        String gender=scan.next();

        System.out.println("enter age");
        int age=scan.nextInt();

        scan.nextLine();
        System.out.println("enter country ");
        String countryName=scan.nextLine();

        System.out.println("enter zipcode ");
        int zipCode=scan.nextInt();

        scan.nextLine();
        System.out.println("enter full name ");
        String fullName=scan.nextLine();

        System.out.println("enter full company name ");
        String fullCompanyName=scan.nextLine();







    }
}
