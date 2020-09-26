package day58_Polymorphism;

import day57_Polymorhism.EmployeeTask.Developer;
import day57_Polymorhism.EmployeeTask.Employee;
import day57_Polymorhism.EmployeeTask.ScrumMaster;
import day57_Polymorhism.EmployeeTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleINC {

    public static void main(String[] args) {

        Employee[] workers =  {
                new Tester("Ali", 124121, "QA", 121000, 'M'),
               new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
               new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
               new Developer("Abdul",123456789,"QA",110000,'M'),
               new Developer("Abdul",123456789,"QA",110000,'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new ScrumMaster("Kamil", 78945, "Scrum Master", 120000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new ScrumMaster("Kamil", 78945, "Scrum Master", 120000, 'M'),
               new Developer("Abdul",123456789,"QA",110000,'M'),
             new Developer("Abdul",123456789,"QA",110000,'M'),
              new Developer("Abdul",123456789,"QA",110000,'M'),
              new Developer("Abdul",123456789,"QA",110000,'M')
        };

        ArrayList<Employee> scrumTeam=new ArrayList<>(Arrays.asList(workers));

int countTester=0;
int countDevelopers=0;
int countScrumMasters=0;

//scrumTeam.forEach(each-> {if (each instanceof Tester) {countTester++;}
//else  if (each instanceof Developer) {countDevelopers++;}
//else countScrumMasters++;});
//
//


for (Employee each: scrumTeam) {
    if(each instanceof Tester) countTester++;
    else if(each instanceof Developer) countDevelopers++;
    else countScrumMasters++;
}

        System.out.println("Testers "+ countTester);
        System.out.println("Developers " +countDevelopers);
        System.out.println("Scrum Masters "+ countScrumMasters);



    }




}
