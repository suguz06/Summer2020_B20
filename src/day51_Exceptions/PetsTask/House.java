package day51_Exceptions.PetsTask;

public class House { //has a relation with dog

    public static void main(String[] args) {

        Dog dog1 = new Dog("Winton", "Scotty Terrier", 'M', 4, "Black", 1234);


        System.out.println(dog1.name);
        System.out.println(dog1); // if you wan to dog class==> override in Dog class toString method

        Cat cat1 = new Cat("Welat", "British Short hair", 'M', 1, "White");
        System.out.println(cat1);
        Tiger tiger1 = new Tiger("Zara","Caspian",'M',12,"Brown");

        System.out.println(tiger1);

        tiger1.eat(); //can be overridden
        tiger1.drink();
        tiger1.sleep();

    }

}

