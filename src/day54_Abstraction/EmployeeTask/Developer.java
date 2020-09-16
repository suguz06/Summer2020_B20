package day54_Abstraction.EmployeeTask;

import day54_Abstraction.EmployeeTask.Employee;

import java.time.LocalDate;


/*
    3. create a sub class of Employee named Developer(meant to be subClass ONLY)

 */
public final class Developer extends Employee {


    public Developer(String name, char gender, LocalDate DOfB, String jobTitle, double salary){
        super(name, gender, DOfB, jobTitle, salary);
    }


//class BA extends Developer{ // final Developer class can never be super class
//
//}


}
