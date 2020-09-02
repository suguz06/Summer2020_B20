package day49_Inheritance.ScrumTeamTask;

import day02_printStatements.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    /*
    create a class called ScrumTeam
                Attributes:
                ArrayList<Tester> testers = new ArrayList<>(),
                    ArrayList<Developer> testers = new ArrayList<>(),
                    Actions:
                 addTester(Tester tester): adds the given tester to the testers arraylist
                  addTesters(Tester[] testers): adds the given testers to the testers arraylist
                addDeveloper(Developer developer): adds the given developer to the developers arraylist
                  addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
                  removeTester(long employeeID): removes the given tester from the testers arraylist
                  removeDeveloper(long employeeID): removes the developer from the developers arraylist

     */

    public ArrayList<Tester> testers = new ArrayList<>();
    public ArrayList<Developer> developers = new ArrayList<>();


    public ScrumTeam(Tester[] testers, Developer[] developers){
        addTesters(testers);
        addDevelopers(developers);
    }

    public void addTester(Tester tester){
        testers.add(tester);
    }


    public void addTesters(Tester[] testers){
       this.testers.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        developers.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public  void removeTester(int employeeID){
        testers.removeIf(p->p.ID==employeeID);
    }

    public  void removeDeveloper(int employeeID){
        developers.removeIf(p->p.ID==employeeID);
    }

    public void removeTesterDeveloper(int testerID, int developerID) {
        removeDeveloper(developerID);
        removeTester(testerID);
    }


    public String toString(){
        return "================================"+
                "\nDevelopers #"+developers.size()+
                "\nTesters #"+testers.size()+
                "\nCapacity: "+((developers.size()+testers.size())*8)+ " point (Dev.Team * 8 Days)"+
                "\nVelocity: "+((developers.size()+testers.size())*8)+ " point for current Sprint (No days Off)"+
                "================================";
    }
}
