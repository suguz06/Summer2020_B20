package day39_CustomClass;

public class Car {


    /*
    Data/Attributes

    model, brand, year, mileage, color, VIN number...
     */

// no need to assign it, since it is a generic case, it can be anyone
    String brand;
    String model;
    int year;
    String color;
    double mileage;
    double price;

// Actions/functions==> methods
    public  void setInfo(String carBrand, String carModel,
                         int carYear, String carColor,
                         double carMileage, double carPrice ){

        brand=carBrand;
        model=carModel;
        year=carYear;
        color=carColor;
        mileage=carMileage;
        price=carPrice;




    }
//sets the info of the cars


//2012 Toyota Corolla, Red, 1000, $ 45000
public  void getInfo() {
    System.out.println(year+ " "+brand+ " "+ model+", "
            +color+", "+ mileage+", $"+price);
}
//prints  the car info

public void start() {
    System.out.println(brand+ " "+ model+ " is started");
}



}
