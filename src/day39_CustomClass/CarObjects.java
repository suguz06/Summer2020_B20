package day39_CustomClass;

public class CarObjects {


    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInfo("Toyota", "Corolla", 2020
                , "White", 2000, 19000.50);

//        car1.brand = "Toyota";
//        car1.model = "Corolla";
//        car1.year = 2020;
//        car1.color = "White";
//        car1.mileage = 2000;
//        car1.price = 19000.50;

        System.out.println(car1.brand);
        System.out.println(car1.mileage);
        System.out.println(car1.model);
        System.out.println(car1.color);


        System.out.println("================");

        Car car2 = new Car();


//        car2.brand = "Mercedes";
//        car2.model="E200";
//        car2.year=2020;
//        car2.color="Blue";
//        car2.mileage=2122;

        car2.setInfo("Mercedes", "E200", 2020,
                "Blue", 12250, 50255);

        System.out.println(car2.brand);
        System.out.println(car2.mileage);
        System.out.println(car2.model);
        System.out.println(car2.color);
        Car car3 = new Car();
        car3.setInfo("Audi", "E200", 2020,
                "Blue", 12250, 50255);

        Car car4 = new Car();

        car4.setInfo("Jeep", "E200", 2020,
                "Blue", 12250, 50255);
        car2.getInfo();
        car1.getInfo();
        car3.getInfo();
        car4.getInfo();

    }
}
