package day54_Abstraction.CarTask;

public class ParkingLot {

    public static void main(String[] args) {

        // Car car= new Car(); // abstarct class can cot create an object
        BMW bmw = new BMW(); // it is concrete +>not abstract=> can create an object

        Tesla tesla = new Tesla();

        Toyota toyota=new Toyota();

        Jeep jeep=new Jeep();


        System.out.println("jeep = " + jeep);

        bmw.start();
        tesla.start();
        toyota.start();
        jeep.start();

    }
}
