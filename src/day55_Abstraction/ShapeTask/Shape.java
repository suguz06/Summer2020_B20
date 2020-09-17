package day55_Abstraction.ShapeTask;

import java.text.DecimalFormat;

public abstract class Shape { //cannot create object and can nor final
/*
1. create an abstract class called Shape
        attributes:
            name(static), area, perimeter, hasVolume(static), volume
        abstract methods: calculateArea(), calculatePerimeter, calculateVolume()
                            return-types: double

 */
//DecimalFormat df=new DecimalFormat("0.00");
    public    String name;
    public  double area;
    public  double perimeter;
    public    boolean hasVolume;
    public double volume;

//    public Shape() {
//        this.area = area;
//        this.perimeter = perimeter;
//        this.volume = volume;
//    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    public  abstract double calculateVolume();




}
