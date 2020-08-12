package day39_CustomClass;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {


        Employee employee1= new Employee();
        Employee employee2=new Employee();
        Employee employee3= new Employee();
        Employee employee4=new Employee();
        Employee employee5= new Employee();


        employee1.setEmployeeInfo("Ali", 'M', 123456112, "QA", 150000);
        employee2.setEmployeeInfo("Velim", 'M', 123456112, "BA", 100000);
        employee3.setEmployeeInfo("Deli", 'M', 123456112, "QA", 92000);
        employee4.setEmployeeInfo("Relim", 'M', 123456112, "BA", 130000);
        employee5.setEmployeeInfo("Seli", 'M', 123456112, "QA", 160000.50);


        ArrayList<Employee> list= new ArrayList<>();
        list.addAll(Arrays.asList(employee1,employee2,employee3,employee4, employee5));

      double max=Integer.MIN_VALUE;

String name="";
        for (Employee each: list){
            double eachsalary=each.salary;
            if(eachsalary>max) {max=eachsalary;
         name=each.name;}
        }
        System.out.println("Maximum salary: "+ max);
        System.out.println("Name: "+ name);

//list.removeIf(p-> p.salary<150000 );

      //  list.removeIf(p-> p.jobTitle.equals("QA"));

       // list.removeIf(p-> p.name.toLowerCase().contains("m"));

        list.removeIf(p-> p.name.toLowerCase().startsWith("r"));

         for (Employee each: list) {
             //each.getEmployerInfo();
             System.out.println(each.name+ " "+ each.salary);
         }
    }
}
