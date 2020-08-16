package day41_toString;

public class Tester {
    String name;
    double salary;
    char gender;
    int age;


    public  void setInfo(String name, double salary, char gender,
                         int age) {
        this.name= name;
        this.salary=salary;
        this.gender= gender;
        this.age= age;

    }
//    public void coding() {
//        System.out.println(name + " is coding");
//    }
    public void reportBugs() {

        System.out.println(name + " is reporting bugs");
    }

    public String toString(){
        return "Name: "+name+ ", gender "+gender+",  age "+age + ", salary  "+ salary+" ";
    }

}


class TesterObject{

    public static void main(String[] args) {



        Tester [] testers={new Tester(), new Tester(),
                new Tester(),new Tester(), new Tester()};
        testers[0].setInfo("Selman", 120000, 'M', 42);
        testers[1].setInfo("Ali", 130000, 'M', 22);
        testers[2].setInfo("Keli", 150000, 'F', 32);
        testers[3].setInfo("Deli", 110000, 'M', 35);
        testers[4].setInfo("Seli", 100000, 'F', 28);

        for (Tester each:testers) {
            System.out.println(each);
        }
        System.out.println("===================");
        for (int i=0; i<testers.length; ++i) {
            testers[i].reportBugs();
        }
    }
}
