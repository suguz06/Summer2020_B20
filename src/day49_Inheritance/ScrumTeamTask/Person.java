package day49_Inheritance.ScrumTeamTask;

/*
 create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo

 */
public class Person {

    public String name;
    public int age;
    public char gender;

    private long ssn; //private=> we dont want to inherited to the subclasses

    public long getSsn() { //getter => read ssn only
        return ssn;
    }

    public void setSsn(long ssn) { //stter=> set ssn only
        this.ssn = ssn;
    }

    public void setInfo(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    private void eat() { //not inherited=> private=> we dont want to inherited to the subclasses
        System.out.println(name + " is eating");
    }

    private void walk() {
        System.out.println(name + " is walking");
    }

    public void sleep() { //inherited
        System.out.println(name + " is sleeping");
    }


//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", gender=" + gender +
//                '}';
//    }
}
