package day39_CustomClass;

public class Dog {

    //instance variables => name breed size color age


    // instance methods  setGetInfo eat drink sleep

    String name;
    String breed;
    String size;
    int age;
    String color;

    public void setDogInfo(String  name, String dogBreed, String dogSize, int age,
                           String dogColor) {
        name =  name;
        breed = dogBreed;
        size = dogSize;
        age = age;
        color = dogColor;
    }
    //sets the info of the dog

    public void getDogInfo() {

        System.out.println("Name: "+ name+ ", Breed:  "+breed + ", size: " + size + ", Color: "+color + ", Age: "+ age + " years old "  );
    }


    public void  eat(String food) {

        System.out.println(name +" is eating "+ food);

    }

    public void drink(String drink) {
        System.out.println(name +" is drinking "+ drink);
    }
public  void sleep() {

    System.out.println(name +" is sleeping");
}

    public  void play() {

        System.out.println(name +" is playing");
    }

}
