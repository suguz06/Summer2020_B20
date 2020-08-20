package day44_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

/*

warmup task:
    1. Create a class called Employee
            instance variables:
                    name, id, ssn, jobTitle, salary, gender
            actions:
                    setEmployeeInfo(): can initialize all the instance variables
                    toString(): can return the info of the employee as string
    2. create a class called HumanResources
            declare 5 variables of Employee as static
            use static block to:
                        1. initialize those static variables
                        2. set all the info of the Employees
    3. create class called BankOfAzerbaijan
        in the main method:
                1. create a List of Employees
                2. add random two employees from HumanResources to the List
                3. use for each loop to print out the employee info
 */
public class WarmUp2 {
}

class Employee {

    String name;
    int id;
    int ssn;
    String jobTitle;
    double salary;
    char gender;

    public void setEmployeeInfo(String name, int id, int ssn, String jobTitle, double salary, char gender) {
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public String toString() {
        return "name: " + name + " id number: " + id + " ssn: " + ssn + " job title: " + jobTitle + " salary: " + salary
                + " gender: " + gender;
    }


}

class HumanResources {

//    static String nameOfCompany;
//    static String nameOfCEO;
//    static String stateOfCompany;
//    static int zipCodeOfCompany;
//    static String countyOfCompany;

    static Employee employee1=new Employee();
    static Employee employee2=new Employee();
    static Employee employee3=new Employee();
    static Employee employee4=new Employee();
    static Employee employee5=new Employee();


    static {
//        nameOfCompany = "Cybertek";
//        nameOfCEO = "Muhtar";
//        stateOfCompany = "TX";
//        zipCodeOfCompany = 75075;
//        countyOfCompany = "Dallas";
        employee1.setEmployeeInfo("Zuleyha",1254,45874641,"QA",110000,'F');
        employee2.setEmployeeInfo("Kyle", 1123, 112345678, "SDET", 110000, 'M');
        employee3.setEmployeeInfo("Marina", 1124, 111234567, "Product Manager", 170000, 'F');
        employee4.setEmployeeInfo("Adeline", 1125, 111123456, "Scrum Master", 80000, 'F');
        employee5.setEmployeeInfo("Jazi", 1126, 111112345, "Business Analyst", 70000, 'F');

//        System.out.println("name of company: " + nameOfCompany + " name  of CEO: " + nameOfCEO + " state of company: " +
//                stateOfCompany + " zip code of Company: " + zipCodeOfCompany + " county of company: " + countyOfCompany);
    }


}

class BankOfAzerbaijan {


    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();


       list.addAll(Arrays.asList(HumanResources.employee2, HumanResources.employee3));
        System.out.println(HumanResources.employee1);

        for (Employee each : list) {
            System.out.println(each);
        }
    }

}