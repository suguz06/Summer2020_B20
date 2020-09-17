package day55_Abstraction.ShapeTask;

import java.text.DecimalFormat;

public final class Cylinder extends Shape {  // can not be inhereted by other classes

/*
4. create a sub class of shape called Cylinder
            attributes: radius, height, name(static), area, perimeter, hasVolume(static), volume
            override the abstrat methods
            add a constructor that takes two arguments for r & h of the cylinder  and initialize the instance variables: radius, height, perimeter, area, and volume
            add a static block that can initialize the static variables of the cylinder
 */


    public double radius;
    public double height;

    public Cylinder(double radius, double height) {
        if(radius<=0 || height<=0){
            throw new RuntimeException("radius and height of cylinder can not be negative or zero");
        }

        this.radius = radius;
        this.height = height;
        area=calculateArea();
        perimeter=calculatePerimeter();
        volume=calculateVolume();
        name = "Cylinder";
        hasVolume = true;
    }

    @Override
    public double calculateArea() {
        return radius * height * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI * height) + (4 * Math.PI * Math.pow(radius, 2));
    }

    @Override
    public double calculateVolume() {
        return Math.pow(radius, 2) * height * Math.PI;
    }

//    static {
//        name = "Cylinder";
//        hasVolume = true;
//    }


    @Override
    public String toString() { //only format while printing => maybe we needed actual result
        DecimalFormat df=new DecimalFormat("0.00");
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                ", area=" + df.format(area) +
                ", perimeter=" +df.format( perimeter) +
                ", volume=" + df.format(volume) +
                '}';
    }
}
