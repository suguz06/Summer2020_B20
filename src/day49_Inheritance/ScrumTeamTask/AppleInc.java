package day49_Inheritance.ScrumTeamTask;

import day02_printStatements.Test;

public class AppleInc {

    /*
    create a class called AppleInc:
                    1. create an array of Testers and store the testers info in your group
                    2. create an array of developers store the developers info in your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
     */


    public static void main(String[] args) {

        Tester tester1 = new Tester("Rakhat", 30, 'F', 125000, 123456, "SDET");
        Tester tester2 = new Tester("Ali", 35, 'M', 115000, 123, "SDET");
        Tester tester3 = new Tester("Ahmet", 30, 'M', 130_000, 10714543, "SDET");


        Tester[] testers={tester1,tester2,tester3};

        Developer developer1 = new Developer("Yadigarjan", 40,'M', 120000, 3212313,"Dev");
        Developer developer2 = new Developer("Ahmet", 30, 'M', 130_000, 10714543, "Dev");
        Developer developer3 = new Developer("Yadigarjan", 40,'M', 120000, 3212313,"Dev");
        Developer developer4= new Developer("fatime",30,'F', 150000,123456,"softwareEngineer");

        Developer[] developers={developer1,developer2,developer3,developer4};


   ScrumTeam scrumTeam1=new ScrumTeam(testers,developers);

        System.out.println(scrumTeam1);

Tester [] testers2={
          new Tester("Rakhat1", 30, 'F', 125000, 123456, "SDET"),
        new Tester("Rakhat2", 30, 'F', 125000, 123456, "SDET"),
};

Developer[] developers2={

        new Developer("Yadigarjan1", 40,'M', 120000, 3212313,"Dev"),
        new Developer("Yadigarjan2", 40,'M', 120000, 3,"Dev")

};



ScrumTeam scrumTeam2=new ScrumTeam(testers2, developers2);

scrumTeam1.removeTester(123);
scrumTeam2.removeDeveloper(3);
        System.out.println("============");

        System.out.println(scrumTeam2);

        ScrumTeam[] allScrumTeam={scrumTeam1,scrumTeam2};

        System.out.println("=====================");

        System.out.println("testers:" );
        for (ScrumTeam eachScrum: allScrumTeam) {
            for (Tester eachTester: eachScrum.testers) {
                System.out.println(eachTester.name+ "  " +eachTester.salary);
            }
        }

        System.out.println("===================");

        System.out.println("developers: ");

        for (ScrumTeam eachScrum: allScrumTeam) {
            for (Developer eachDev: eachScrum.developers) {
                System.out.println(eachDev.name+"  "+eachDev.salary);
            }
        }


    }
}
