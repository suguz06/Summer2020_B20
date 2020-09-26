package day58_Polymorphism.AnimalTask;
/*
    2. create subclass of Animal named Cat
            variable: catName
            methods: scratch, toString

 */
public class Cat extends Animal { //call constructor=> otherwise it give compile error

    public String catName;

    public Cat(String  catName,int age, char gender) {
        super(age, gender); //top priority is call constructor from super class
        this.catName=catName;

    }

    public  void scracth(){
        System.out.println("Cat "+ catName+ " is scratching");

    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
