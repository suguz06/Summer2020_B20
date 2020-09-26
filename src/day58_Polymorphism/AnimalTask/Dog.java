package day58_Polymorphism.AnimalTask;

/*

    3. create subclass of Animal named Dog
            variable: dogName
            methods: bark, toString
 */

public class Dog extends Animal{ // In Polymoprhism,  all overriden methods are executed
//not overriden=> super class methods executed

 public String dogName;

    public Dog(String dogName,int age, char gender) {
        super(age, gender);
        this.dogName=dogName;
    }

    public void bark(){
        System.out.println("Dog "+ dogName+ " is barking");
    }


    @Override
    public void eat() {
        System.out.println("Dog "+ dogName+ " is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog "+ dogName+ " is sleeping");

    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
