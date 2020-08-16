package day42_Static;
/*
create a class called Testers
                    Attributes:
                        name, employeeID, JobTitle, Salary, gender
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()

 */
public class Tester {
    String name;
    char gender;
    long employeeID;
    String jobTitle;
    double salary;


    public void setInfo(String name, char gender, long employeeID, String jobTitle,
            double salary) {
        this.name= name;
        this.gender=gender;
        this.employeeID= employeeID;
       this.jobTitle=jobTitle;
        this.salary= salary;
    }
    public void smokeTesting(){
        System.out.println(name+ " is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+ " is creating ticket");
    }

    public String toString(){
        return "Name: "+name+ ", Gender: "+ gender+ ", Job title: "+ employeeID+", Employee ID "+ jobTitle+" "+ salary;
    }



}


class Developers {

}

//class ScrumTeam{
//
//
//}


class MyScrumTeam {

    public static void main(String[] args) {




    }
}