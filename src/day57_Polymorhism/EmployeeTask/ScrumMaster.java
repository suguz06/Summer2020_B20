package day57_Polymorhism.EmployeeTask;

public class ScrumMaster extends  Employee{
    public ScrumMaster(String name, int id, String jobTitle, double salary, char gender) {
        super(name, id, jobTitle, salary, gender);
    }

    @Override
    void work() {
        System.out.println("Scrum master "+ name + " is working");

    }

    @Override
    public String toString() {
        return "ScrumMaster{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", gender=" + gender +
                '}';
    }
}
