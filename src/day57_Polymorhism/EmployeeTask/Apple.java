package day57_Polymorhism.EmployeeTask;

import java.util.ArrayList;

public class Apple {
/*
 4. create a class named Apple:
            create an arraylist(you decide the reference type),
             and store 4 testers and 3 developers objects

 */

    public static void main(String[] args) {

        ArrayList<Employee> scrumTeam = new ArrayList<>();

        scrumTeam.add(new Tester("Ali", 124121, "QA", 121000, 'M'));
        scrumTeam.add(new Tester("Veli", 12121, "QA", 131000, 'M'));
        scrumTeam.add(new Tester("Zeli", 122121, "QA", 171000, 'F'));

        scrumTeam.add(new Developer("Ali1", 121021, "Dev", 181000, 'M'));
        scrumTeam.add(new Developer("Veli1", 182121, "Dev", 161000, 'F'));
        scrumTeam.add(new Developer("Zeli1", 121521, "Dev", 121000, 'F'));
        scrumTeam.add(new Developer("Zeli2", 122121, "Dev", 131000, 'F'));

        scrumTeam.add(new ScrumMaster("aaaa", 1213, "SM", 1212124, 'F'));

        for (Employee each : scrumTeam) {
            System.out.println(each.name + "   " + each.salary);
        }

        System.out.println("scrumTeam.get(0) = " + scrumTeam.get(0));
        System.out.println("scrumTeam.get(scrumTeam.size()-1) = " + scrumTeam.get(scrumTeam.size() - 1));

        for (Employee each : scrumTeam) {
            System.out.println("each = " + each);
        }

    }
}
