package day50_Override.CarTask;

/*
Jeep:
    start(): Call Mechanic
             Oil Change
             jump start

 */
public class Jeep extends Car{


    public void start() {
        System.out.println("Call Mechanic\n" +
                "             Oil Change\n" +
                "             jump start");
    }
}