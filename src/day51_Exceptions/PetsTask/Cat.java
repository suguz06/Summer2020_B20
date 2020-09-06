package day51_Exceptions.PetsTask;

public class Cat extends  Pets{

// calling parent class constructor (MAndatory) otherwise give compile error
    public Cat(String name, String breed, char gender, int age, String color) {
        super(name, breed, gender, age, color);
    }


    @Override
    public String toString() {
        return "Cat{" +  // see here implementation change==> CAT !! not PETS
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                '}';
    }



}
