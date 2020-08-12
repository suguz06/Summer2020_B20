package day39_CustomClass;

public class DogPark {

    public static void main(String[] args) {
        //dogPark

        Dog[] dogPark = {new Dog(), new Dog(), new Dog(),
                new Dog(), new Dog()};


        for (int i = 0; i <= dogPark.length - 1; ++i) {
            dogPark[i].getDogInfo();
        }

        dogPark[0].setDogInfo("Red", "Golden", "Medium", 4, "Yellow");
        dogPark[1].setDogInfo("Roko", "German Sheper", "Medium", 3, "Brown");
        dogPark[2].setDogInfo("Chance", "Cocker spaniel", "small", 1, "Golden");
        dogPark[3].setDogInfo("Akbas", "German Sheper", "Medium", 3, "Brown");
        dogPark[4].setDogInfo("Heyy", "Cocker spaniel", "small", 1, "Golden");

        for (int i = 0; i <= dogPark.length - 1; ++i) {
            dogPark[i].getDogInfo();
        }

        System.out.println("=======================");

        for (Dog each : dogPark) {
            each.getDogInfo();
        }

        for (Dog each : dogPark) {
            each.sleep();
        }

        System.out.println("===========================");


        String food="treats";

        for (Dog each : dogPark) {
            each.eat(food);
        }
        System.out.println("=============================");
        String drink="milk";

        for (Dog each : dogPark) {
            each.drink(drink);
        }

        System.out.println("=============================");


        for (Dog each : dogPark) {
            each.play();
        }

    }
}
