package day57_Polymorhism.EmployeeTask;

public abstract class  Employee {
    /*
    ask:
    1. create an abstract class named Employee
            Attributes: name, id, jobTitle, salary, gender
            abstract method: work
            add a constructor to initialize the fileds

     */

    public String name;
    public int id;
    public String jobTitle;
    public double salary;
    public char gender;

    abstract void work();

    public Employee(String name, int id, String jobTitle, double salary, char gender) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }



}
