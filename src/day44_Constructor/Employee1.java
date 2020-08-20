package day44_Constructor;


/*
warmup task:
    1. Create a class called Employee
            instance variables:
                    name, id, ssn, jobTitle, salary, gender
            actions:
                    setEmployeeInfo(): can initialize all the instance variables
                    toString(): can return the info of the employee as string

 */
public class Employee1 {

    String name;
    int id;
    int ssn;
    String jobTitle;
    double salary;
    char gender;

    static boolean isEmployed  ;
    static boolean hasSalary  ;

    static {
        isEmployed = true;
          hasSalary = true;
    }

    public void setEmployee1(String name, int id, int ssn, String jobTitle,
                            double salary, char gender) {
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
       // hasSalary=true; many times it is called==> then use static blocj
       // isEmployed=true;
    }


    public String toString(){
        return "Name: "+name+"\nGender: "+gender+"\nID: "+id+"\nSSN: "+ssn+"\nJobTitle: "+jobTitle+
                "\nSalary: "+salary +" \n ";
    }


}
