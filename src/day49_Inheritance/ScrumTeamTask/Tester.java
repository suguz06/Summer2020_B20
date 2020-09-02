package day49_Inheritance.ScrumTeamTask;

public class Tester extends  Employee{

/*
create a subclass of Employee called Testers
                    Attributes:
                        ame, age, gender, Salary, ID, jobTitle
                    Actions:
                        work, setInfo(), smokeTesting(),  creatingTicket(), toString()
 */
// work(), toString() =>inherited by Employee


    public Tester(String name, int age, char gender,
                  double salary, int ID, String jobTitle){
        setInfo(name, age, gender, salary, ID, jobTitle);
    }

    public void smokeTesting(){
        System.out.println("Tester " +name+ " is performing the smoke testing");
    }


    public void creatingTicket(){
        System.out.println("Tester " + name+ " is creating ticket on JIRA");
    }

//    public String toString() { // we created object to Testers==> we need toString to print objects
//        return "Testers{" +
//                "salary=" + salary +
//                ", ID=" + ID +
//                ", jobTitle='" + jobTitle + '\'' +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", gender=" + gender +
//                '}';
//    }
}
