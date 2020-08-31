package day48_Inheritance.AnimalTask;

public class Cat extends Animal{

    //using constructor and setInfo==> no inherited by parent class since name is not inherited
    public Cat(String name, String size, int age, char gender,String breed, double weight) {
         setInfo(name, size, age, gender,breed, weight); // just one line code
//        this.name=name;  // these are also worked
//        this.size=size;
//        this.age=age;
//        this.gender=gender;
//        this.breed=breed;
//        this.weight= weight;
    }


    /*
variables:4
methods:5 +1(meow)
 */

public void meow(){
    System.out.println(name+ " is meowing");
}


    public static void main(String[] args) {
        Cat cat=new Cat("van","medium",3,'M',"erks", 22.02);
        System.out.println(cat);
    }


}
