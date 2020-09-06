package day51_Exceptions.PetsTask;
/*

 Animal Task:
            1. create a class called Pet
                    attributes:
                            name, age, gender, breed, color
                    create a constructor that can initialize the instances
                   instance methods (with protected access modifiers):
                            eat(): by default assume all Pets eat  chocolate
                            drink(): by default assume all Pets drink milk
                            sleep(): by default assume all Pet sleep on the floor
                            toString():

 */

public class Pets {

    public String name;
    public int age;
    public char gender;
    public String breed;
    public String color;

    public Pets(String name, String  breed, char gender, int age, String  color) {
      this.name=name;
      this.breed=breed;
     this.gender=gender;
     this.age=age;
     this.color=color;
    }



    protected void eat(){
        System.out.println(name+ " is eating  chocolate  ");
    }
    protected void drink(){
        System.out.println(name+ " is drinking milk  ");
    }
    protected void sleep(){
        System.out.println(name+ " is sleeping on the floor  ");
    }

@Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
