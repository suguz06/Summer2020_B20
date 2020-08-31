package day48_Inheritance.AnimalTask;

public class AnimalObjects {

    public static void main(String[] args) {


        Dog dog1=  new Dog("Winston","Medium",3, 'M',"tyte", 12.03);

        System.out.println(dog1.name);
        System.out.println(dog1.size);

        dog1.bark();
        dog1.eat();
        dog1.sleep();

        System.out.println(dog1.age);
        System.out.println(dog1.gender);
        System.out.println(dog1);

        Cat cat1=new Cat("Sesi", "Medium", 3, 'F', "van", 6.25);

        System.out.println(cat1);
    }
}
