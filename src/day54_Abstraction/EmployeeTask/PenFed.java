package day54_Abstraction.EmployeeTask;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class PenFed {
/*
 4. create a class called PenFed
            create 3 objects of Tester and Developers
            try to make change to the gender & DOfB of the employees

 */
    public static void main(String[] args) {

        Tester tester1=new Tester("Polat Alemdar",'M', LocalDate.of(1973,11,20),"SDET",150_000);
//tester1.gender='F';//can not modify
     //   tester1.DOfB=LocalDate.of(1980, 5, 12); //not modify


        System.out.println(tester1.gender);
        System.out.println(tester1.DOfB);

        Developer developer1= new Developer("Comolokko",'F',LocalDate.of(1990,03,10),"SDET",111000);
//developer1.gender='M';  it is FINAL VARIABLE=>
//developer1.DOfB=LocalDate.of(1996, 5, 9);

        System.out.println(developer1);
    }
}
