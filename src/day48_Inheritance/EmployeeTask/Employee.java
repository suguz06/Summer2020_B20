package day48_Inheritance.EmployeeTask;

public class Employee {


    public double salary;
    public String  name;
    public int ID;
    public String jobTitle;
    public char gender;

    public void setInfo(double salary, String name, int ID, String jobTitle, char gender){
        this.salary=salary;
        this.name=name;
        this.ID=ID;
        this.jobTitle=jobTitle;
        this.gender=gender;
    }



    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                '}';
    }
}
