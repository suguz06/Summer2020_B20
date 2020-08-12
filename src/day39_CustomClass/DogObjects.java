package day39_CustomClass;

public class DogObjects {

    public static void main(String[] args) {


        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("mike", "Poodle", "Big", 8, "brown");
        dog2.setDogInfo("jen", "Great Dane", "meddium", 5, "black");
        dog3.setDogInfo("jojo", "Beagle", "small", 3, "black/white");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat("Kelle paca");
        dog3.eat("Steak");
        dog2.eat("polo");

        dog1.drink("Water");
        dog3.drink("Cola");
        dog2.drink("Soda");

        dog1.sleep();

    }
}
