package day48_Inheritance.AnimalTask;

public class Dog extends Animal { //Animal => super or parent class

    // Dog=> child or sub class

    // inherited=> 2 method and 2 attributes

    /* inherited by super or parent class
    variables:  => name, age , size, gender
    methods:  eat sleep toString

     */

   // int age; => best way give in parent class


    public Dog(String name, String size, int age, char gender,String breed, double weight){
        setInfo(name, size, age, gender,breed, weight);  //constructor use setInfo

    }




    public void bark(){
        System.out.println(name+ " is barking");
    }



//
//    public static void main(String[] args) {
//        Dog o=new Dog();
//        o.eat();
//    }

}
