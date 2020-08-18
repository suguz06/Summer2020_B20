package day42_Static;

public class Car {

    String brand;
    String model;
    int year;
    String VIN;
    String color;
    double price;


   static boolean hasWheel=true;
  static int numberOfTires=4;
  static boolean hasEngine=true;
  static boolean hasDoors=true;
  static boolean hasSeatBelt=true;
  static boolean hasHorn=true;


    /*
    car1
    car2
    car3
    car4
     */



    public  void start(){ //instance cuz we use instance variables
        System.out.println("starting "+ brand+ " "+model);
    }

    public static void printTires(){ //static cuz we use static variables
        System.out.println( "tires"+ numberOfTires);
    }


    public String toString() { // instance cuz we use instance and static variables
        return "Brand: "+ brand+ " Model: "+ model +" \n number of tires "+numberOfTires +" has engine: "
               +hasEngine;
    }


    public static void main(String[] args) {

        Car car1=new Car();



        System.out.println(car1);
    }

}
