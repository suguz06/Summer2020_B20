package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

/*
    2. create a sub class of Employee named Tester(meant to be subClass ONLY)

 */

public final  class Tester extends Employee{ // final==> it can only be subclass=> NO SUPER CLASS
// final can be child, can be taken=> not given

    public Tester(String name, char gender, LocalDate DOfB, String jobTitle, double salary) {
        super(name, gender, DOfB, jobTitle, salary);
    }

    public void findBug(){
        System.out.println(name+ " is finding bug");
    }


}
