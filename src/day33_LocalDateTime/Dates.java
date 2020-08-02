package day33_LocalDateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class Dates {

    public static void main(String[] args) {

        LocalDate dOfBirth = LocalDate.of(2020, 7, 24);

        System.out.println(dOfBirth);

        LocalDate today = LocalDate.now(); // now=>>gets the current date
        System.out.println(today);

        LocalDate y = LocalDate.of(2019, 1, 1);
        boolean a = y.isLeapYear();

        System.out.println(a);

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a year");
        int year=scan.nextInt();
        boolean aa=LocalDate.of(year, 1, 1).isLeapYear();

        System.out.println("This "+year + " is leap year: "+ aa);

        System.out.println("============");
        System.out.println("Enter a year, month and day");
        LocalDate e=LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
boolean ee=e.isLeapYear();
        System.out.println(e+ " "+ee);

    }
}
