package day51_Exceptions.PetsTask;

public class Dog extends Pets  {

 double price;

    public Dog(String name, String breed, char gender, int age, String color, double price) {
        super(name, breed, gender, age, color);
        this.price=price;
    }

//
//// constructor calls constructoor==>> super () ==> call super class constructor
//    public Dog(String name, String breed, char gender, int age, String color) {
//        super(name, breed, gender, age, color);
////        super.name=name;
////        super.breed=breed;
////        super.gender=gender;
////        super.age=age;
////        super.color=color;
//    }



//    public String toString(){
//        return super.toString();
//    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
