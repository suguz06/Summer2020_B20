package day39_CustomClass;

public class CarMax {


    public static void main(String[] args) {


        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Lexus", "RX350", 2020,
                "Black", 2000, 20000);
        car2.setInfo("Lexus", "RX450", 2019,
                "Blue", 2000, 25000);
        car3.setInfo("Bugatti", "Veyron", 2020,
                "Black", 2000, 20000);
        car4.setInfo("Ford", "Escape", 2020,
                "Black", 2000, 20000);

        car5.setInfo("Nissan", "GT-R", 2020,
                "Black", 2000, 20000);



car1.getInfo();
car2.getInfo();
car3.getInfo();
car4.getInfo();
car5.getInfo();

car3.start();

car5.start();
    }


}
