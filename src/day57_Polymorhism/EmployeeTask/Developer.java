package day57_Polymorhism.EmployeeTask;

public class Developer extends Employee{


    public Developer(String name, int id, String jobTitle, double salary, char gender) {
        super(name, id, jobTitle, salary, gender);
    }

    @Override
    void work() {

    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", gender=" + gender +
                '}';
    }
}
