package day56_Abstraction.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Cat cat=new Cat();

        cat.eat();
        cat.play();
        cat.sleep();

        Parrot parrot=new Parrot();

        parrot.talk();
        parrot.fly();
    }
}
