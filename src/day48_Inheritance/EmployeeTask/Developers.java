package day48_Inheritance.EmployeeTask;

public class Developers extends Employee {


    public Developers(double salary, String name, int ID, String jobTitle, char gender) {
        setInfo(salary, name, ID, jobTitle, gender);

    }

    public void fixingBugs(){
        System.out.println(name+ " is fixing bugs");
    }
}
