package day48_Inheritance.EmployeeTask;

public class Testers extends Employee {

    public Testers(double salary, String name, int ID, String jobTitle, char gender) {
    setInfo(salary, name, ID, jobTitle, gender);

    }


    public void findingBugs(){
        System.out.println(name+" is finding bugs");
    }


}
