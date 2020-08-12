package day39_CustomClass;


public class Employee {

    //atrributes  => employeName; gender, SSN, jobtitle, Salary


    String name;
    char gender;
    long SSN;
    String jobTitle;
    double salary;

    public void setEmployeeInfo(String employeeName,
                                char employeeGender, long employeeSSN,
                                String employeejobTitle,
                                double employeeSalary) {

        name = employeeName;
        gender = employeeGender;
        SSN = employeeSSN;
        jobTitle = employeejobTitle;
        salary = employeeSalary;
    }

    public void getEmployerInfo() {
        System.out.println("Name: " + name + ", Gender: " + gender +
                ", Job Title: " + jobTitle + ", Salary:  " + salary);
        String ssn = SSN + "";
        System.out.println("SSN " + (ssn.substring(ssn.length() - 4)));

    }


}
