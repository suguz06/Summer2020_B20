package day41_toString;

public class Developer {
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
    public void coding() {
        System.out.println(name + " is coding");
    }
    public void fixBugs() {

        System.out.println(name + " is fixing bugs");
    }

    public String toString(){
        return "Name"+name+ ", gender "+gender+",  age "+age + ", salary  "+ salary+" ";
    }

}

class DeveloperObject{

    public static void main(String[] args) {

         Developer [] devs={new Developer(), new Developer(),
                 new Developer(),new Developer(), new Developer()};
devs[0].setInfo("Selman", 120000, 'M', 42);
        devs[1].setInfo("Ali", 130000, 'M', 42);
        devs[2].setInfo("Keli", 150000, 'F', 42);
        devs[3].setInfo("Deli", 110000, 'M', 42);
        devs[4].setInfo("Seli", 100000, 'F', 42);

 for (Developer each:devs) {
     each.coding();
 }
        System.out.println("===================");
 for (int i=0; i<devs.length; ++i) {
     devs[i].coding();
 }



    }

}
