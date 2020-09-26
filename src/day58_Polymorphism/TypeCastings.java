package day58_Polymorphism;


import day51_Exceptions.BrowsersTask.ChromeBrowser;
import day51_Exceptions.BrowsersTask.FireFoxDriver;
import day51_Exceptions.BrowsersTask.Webdriver;
import day57_Polymorhism.AbstractionTask1.Iphone;
import day57_Polymorhism.AbstractionTask1.Phone;
import day57_Polymorhism.AbstractionTask1.Samsung;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

public class TypeCastings {


    public static void main(String[] args) {
       // Primitive type casting => 1-implicit 2-expilcit
        int a=100;
        double b=a; // smaller to larger=> impliict casting (autotically)
        byte c= (byte) b; //larger to smaller => explicit casting by manually => other wise gives compile error

    //Refrence type .
        // 1-Upcasting => casting from subclass type to super class type

        // Dog dog=new Dog(); Cat cat=new Cat();
        // Animal animal=dog; => polymorphism and done impilictly
        // Animal animal=(Animal) cat; => no need to (Animal) upcasting
        // polymorphism and done impilictly

        // 2-DownCasting=> Super class to subclass => manullay casting

        Cat cat=new Cat("feee", 2, 'm');
        Dog dog1=new Dog("All", 2, 'f');
        Animal animal=dog1; //done implicitly => Up Casting
        Animal animal2=cat; //converting subtype to super type=> implicit

        // or
        Animal animal1=(Animal)dog1; // no need=> compiler implicit casting


        System.out.println("==================");

        //double> float>long> int> short> byte

        //explicit casting (Primitive type casting)=> larger to smaller

        int x=100;
        byte y= (byte) x; // larger to smaller=> explicit casting by manullay


    Animal animal3=new Dog("aa", 3, 'm');//reference type is Super
      //casting from Super to sub type=> explicily or MUST be done manually
        Dog animal4= (Dog) animal3; //it has to be done manually=> explicit or DownCasting

        //animal3.bark(); //refrecen type is animal=> you have to call DownCasting manullay to subclass


        ((Dog) animal3).bark(); // IS A relation to CASTING


//        Webdriver driver=new ChromeBrowser();
//        driver=new FireFoxDriver(); //up casting automatically
//
//        ChromeBrowser  driver1=new ChromeBrowser();
//        Webdriver driver3=driver1; // automatically casting

        Animal animal5=new Cat("aad", 2, 'f');
        //Dog dog= (Dog) animal5; // Pre condition=> must be IS A relation
        //dog is a cat??? => gives ClassCastException


        System.out.println("=========================");

       Phone phone1=new Iphone("XX", 1000, 5.3); //implicit casting or UpCasting

        Iphone phone2=new Iphone("XX", 1000, 5.3); //implicit casting or UpCasting

        Phone phone3=(Phone) phone2; //Upcasting => implicitly do it
        //no need (Phone)=>gray colour says no needed


        Phone phone4=new Samsung("cc", 1200, 5.6);

        Samsung samsung= (Samsung) phone4; //sublcass can never be reference super class
        //nedeed to DownCasting =>> manullally and explicitly

    }



}
