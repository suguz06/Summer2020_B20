package day58_Polymorphism.AnimalTask;

import day51_Exceptions.BrowsersTask.ChromeBrowser;
import day51_Exceptions.BrowsersTask.Webdriver;

public class Zoo {

    public static void main(String[] args) {

        Dog dog1=new Dog("Kara", 4, 'M');
        Animal dog2=new Dog("Kara1", 4, 'F');



          dog1.sleep(); //super class (version) implements //inheried this method
          dog1.eat();
          dog1.bark();

        

//we can call all of variables
        System.out.println(dog1.gender);
        System.out.println(dog1.dogName);
        System.out.println(dog1.age);


        System.out.println("dog1 = " + dog1);

        System.out.println("===================");

          Animal animal1=new Dog("Beyaz", 4, 'M');

          animal1.sleep();
          animal1.eat();
        //  animal1.bark() //not called=> no allowed ==> this refrence type there is no method

        System.out.println("animal1 = " + animal1);


        //System.out.println(animal1.dogName); we can not call => since reference type
        //super class can not call subclasses

        // reference type decides which accesible variable and method

    }



}
