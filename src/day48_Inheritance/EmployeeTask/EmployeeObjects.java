package day48_Inheritance.EmployeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {


        Testers testers1=new Testers(120000, "Ali", 123456, "SDET", 'M');

        Developers developers1=new Developers(180000, "Selman", 123454, "Devs", 'M');

        testers1.findingBugs();
        developers1.fixingBugs();

        System.out.println(testers1);
        System.out.println(developers1);


    }
}
