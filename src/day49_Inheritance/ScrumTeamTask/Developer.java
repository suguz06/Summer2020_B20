package day49_Inheritance.ScrumTeamTask;

public class Developer extends Employee {
/*
create a subclass of Employee called called Developer
                    Attributes:
                        ame, age, gender, Salary, ID, jobTitle
                    Actions:
                        setInfo(), coding(),  fixBug(), toString()

 */

    public Developer(String name, int age, char gender,
                     double salary, int ID, String jobTitle) {
        setInfo(name, age, gender, salary, ID, jobTitle);
    }
//method overloading  setInfo()=> sets name age gender salary id jobTitle


    public void coding(){
        System.out.println(name+ " is coding");
    }


    public void fixingBug(){
        System.out.println(name+ " is fixing bug");
    }


//    public String toString() {
//        return "Developer{" +
//                "salary=" + salary +
//                ", ID=" + ID +
//                ", jobTitle='" + jobTitle + '\'' +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", gender=" + gender +
//                '}';
//    }
}
