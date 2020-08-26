package day44_Constructor;

import day03_sequence_Variables.EmployeeInfo_Variables;

/*
2. create a class called HumanResources
            declare 5 variables of Employee as static
            use static block to:
                        1. initialize those static variables
                        2. set all the info of the Employees

 */
public class HumanResource {


    static Employee1 employee1;
    static Employee1 employee2;
    static Employee1 employee3;
    static Employee1 employee4;
    static Employee1 employee5;

    //employee1=new Employee1;

    static {

        employee1= new Employee1();
        employee2= new Employee1();
        employee3= new Employee1();
        employee4= new Employee1();
        employee5= new Employee1();
        employee1.setEmployee1("Muhammed",12312,456432,"SDET",120000,'M');
        employee2.setEmployee1("Erkan",45678,123987,"QA",115000,'M');
        employee3.setEmployee1("Asiya",56431,657098,"Instructor",99000,'F');
        employee4.setEmployee1("Ayse",17876,342567,"SDET",125000,'F');
        employee5.setEmployee1("Ahmet",67543,987654,"Developer",140000,'M');


    }


    // in main method we can initilized but we do nou use another class
//    public static void main(String[] args) {
//
//        employee1= new Employee1();
//        employee2= new Employee1();
//        employee3= new Employee1();
//        employee4= new Employee1();
//        employee5= new Employee1();
//        employee1.setEmployee1("Muhammed",12312,456432,"SDET",120000,'M');
//        employee2.setEmployee1("Erkan",45678,123987,"QA",115000,'M');
//        employee3.setEmployee1("Asiya",56431,657098,"Instructor",99000,'F');
//        employee4.setEmployee1("Ayse",17876,342567,"SDET",125000,'F');
//        employee5.setEmployee1("Ahmet",67543,987654,"Developer",140000,'M');
//
//
//
//    }

}
