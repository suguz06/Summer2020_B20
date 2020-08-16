package day42_Static;

import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {


        Tester[] testers = {new Tester(), new Tester(), new Tester()};


        testers[0].setInfo("Aalia", 'F', 15111L, "Lead Tester", 180000);
        testers[1].setInfo("Naz", 'F', 15222L, "Tester", 180000);
        testers[2].setInfo("Kalbinur", 'F', 15333L, "Tester", 210000);
        System.out.println(testers[0]);

        Developer[] developers = {new Developer(),new Developer(),
                new Developer(), new Developer(),
        new Developer()};

        developers[0].setInfo("waqar", 'M', 2111L, "Dev Lead" , 145000);
        developers[1].setInfo("roza", 'F', 3222L, "Dev", 135000);
        developers[2].setInfo("burak", 'M', 43333L, "Dev", 154000);
        developers[3].setInfo("riza", 'F', 3222L, "Dev", 150000);
        developers[4].setInfo("Virginia", 'F', 2333L, "Dev", 120000);

        ScrumTeam team1 = new ScrumTeam();


        team1.setInfo("Selman", "Ali", "Veli");
        team1.addTester(testers);
        team1.addDeveloper(developers);
        System.out.println(team1);


    }
}
