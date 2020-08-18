//package day42_Static;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//
//class tester{
//
//    String name;
//    char gender;
//    long employeeID;
//    String jobTitle;
//    double salary;
//
//
//    public void setInfo(String name, char gender, long employeeID, String jobTitle,
//                        double salary) {
//        this.name= name;
//        this.gender=gender;
//        this.employeeID= employeeID;
//        this.jobTitle=jobTitle;
//        this.salary= salary;
//    }
//    public void smokeTesting(){
//        System.out.println(name+ " is smoke testing");
//    }
//    public void creatingTicket(){
//        System.out.println(name+ " is creating ticket");
//    }
//
//    public String toString(){
//        return "Name: "+name+ ", Gender: "+ gender+ ", Job title: "+ employeeID+", Employee ID "+ jobTitle+" "+ salary;
//    }
//}
//
//
//class developer{
//    String name;
//    char gender;
//    long employeeID;
//    String jobTitle;
//    double salary;
//
//
//    public void setInfo(String name, char gender, long employeeID, String jobTitle,
//                        double salary) {
//        this.name = name;
//        this.gender = gender;
//        this.employeeID = employeeID;
//        this.jobTitle = jobTitle;
//        this.salary = salary;
//    }
//
//    public void coding() {
//        System.out.println(name + " is coding");
//    }
//
//    public void fixingBug() {
//        System.out.println(name + " is fixing bug");
//    }
//
//
//    public String toString() {
//        return "Name: " + name + ", Gender: " + gender + ", Job title: " + employeeID + ", Employee ID " + jobTitle + " " + salary;
//    }
//}
//
//class scrumteam{
//    ArrayList<tester> testers=new ArrayList<>();
//    ArrayList<developer> developers=new ArrayList<>();
//    String PO;
//    String BA;
//    String SM;
//
//    public void setInfo(String PO, String BA, String SM){
//        this.PO= PO;
//        this.BA=BA;
//        this.SM=SM;
//    }
//
//    public void addTester(tester tester) {
//        testers.add(tester);
//
//    }
//    public void addTester(tester [] testers) {
//        if(testers.length==0) { // no added, it quits methods
//            return;
//        }
//        this.testers.addAll(Arrays.asList(testers));
//
//    }
//
//    public void removeTester(long employeeID){
//        testers.removeIf(p-> p.employeeID==employeeID);
//    }
//
//    public void addDeveloper(developer developer) {
//        developers.add(developer);
//
//    }
//    public void addDeveloper(developer[] developers) {
//
//        if(developers.length==0) { // no added, it quits methods
//            return;
//        }
//        this.developers.addAll(Arrays.asList(developers));
//
//    }
//
//    public void removeDeveloper(long employeeID){
//        developers.removeIf(p-> p.employeeID==employeeID);
//    }
//
//    public String toString(){
//
//        return "Scrum Team:  "+ testers.size()
//                + "  testers,  "+ developers.size()+
//                " developers, PO: "+PO+ ", BA: "+ BA+ ", SM: "+SM;
//    }
//
//}
//
//class capitalone{
//    public static void main(String[] args) {
//
//
//        tester[] testers = {new tester(), new tester(), new tester()};
//
//
//        testers[0].setInfo("Aalia", 'F', 15111L, "Lead Tester", 281000);
//        testers[1].setInfo("Naz", 'F', 15222L, "Tester", 180000);
//        testers[2].setInfo("Kalbinur", 'F', 15333L, "Tester", 210000);
//        // System.out.println(testers[0]);
//
//        developer[] developers = {new developer(), new developer(),
//                new developer(), new developer(),
//                new developer()};
//
//        developers[0].setInfo("waqar", 'M', 2111L, "Dev Lead", 145000);
//        developers[1].setInfo("roza", 'F', 3222L, "Dev", 135000);
//        developers[2].setInfo("burak", 'M', 43333L, "Dev", 154000);
//        developers[3].setInfo("riza", 'F', 3223L, "Dev", 150000);
//        developers[4].setInfo("Virginia", 'F', 2333L, "Dev", 120000);
//
//        ScrumTeam team1 = new ScrumTeam();
//
//
//        team1.setInfo("Selman", "Ali", "Veli");
//        team1.addTester(testers); // also you can add team1.testers.addAll(Arrays.asList(testers));
//        team1.addDeveloper(developers);
//        System.out.println(team1);
//
//        System.out.println("=================");
//        for (tester each : team1.testers) { // inside the testers OR team1.testers
//            System.out.println(each); //each==> every single tester
//            System.out.println("name: " + each.name + " salary: $" + each.salary);
//        }
//        System.out.println("========");
//
//        for (developer each : team1.developers) {
//            System.out.println(each.name + ":  $" + each.salary);
//        }
//
//        System.out.println("==================");
////        team1.removeTester(15333L);
////        team1.removeDeveloper(2333L);
////        team1.removeDeveloper(3222L);
//
//        System.out.println("=================");
//
//        developer dev1 = new developer();
//        dev1.setInfo("Luisa", 'F', 2233L, "Dev Lead", 250000);
//        team1.addDeveloper(dev1);
//
//
//        System.out.println(team1);
//
//
//
//        ScrumTeam[] scrumTeams={team1, new ScrumTeam(), new ScrumTeam()};
//        /*
//        print all developers, testers from scrum team
//         */
//        // 3 scrum teams occur, entire teams
//
//
//        // find max salary for Devs and Testers
//
//
//        double max=Double.MIN_VALUE;
//        String name="";
//        for(Developer each: team1.developers) {
//            if(each.salary>max) {max=each.salary;
//                name=each.name;}
//
//        }
//        System.out.println(name+ " "+ max);
//
//        double max1=Double.MIN_VALUE;
//        String name1="";
//        for(Tester each: team1.testers) {
//            if(each.salary>max1) {max1=each.salary;
//                name1=each.name;}
//
//        }
//        System.out.println(name1+ " "+ max1);
//
//        System.out.println();
//
//
//    }
//
//}
//
//public class Warmup {
//}
