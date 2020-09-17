package day54_Abstraction.AnimalTask;

public class Dog  extends  Animal{

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void eat() {
        System.out.println(name +" eating bone ");
    }

    @Override
    public void drink() {
        System.out.println(name+ " is drinking water");

    }
}
