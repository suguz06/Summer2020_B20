package day51_Exceptions.PetsTask;

public class Tiger extends Pets { // complie error=> subclass must call the super class constructor


    public Tiger(String name, String breed, char gender, int age, String color) {
        super(name, breed, gender, age, color);
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
