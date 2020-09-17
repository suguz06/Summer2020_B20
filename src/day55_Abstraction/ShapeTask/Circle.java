package day55_Abstraction.ShapeTask;


import java.text.DecimalFormat;

/*
 2. create a sbub class of shape called Circle (meant to be subclass ONLY)
            attributes: radius, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods
            (if the shape does not have volume, return 0 for the colume)
            add a constructor that takes an argument for radius of the circle and initialize the instance variables: radius, area, perimeter, volume
            add a static block that can initialize the static variables of the circle

 */
public final class Circle extends Shape { // can not be inhereted by other classes

   // DecimalFormat df=new DecimalFormat("0.00");
    // inhertired variables=> names ....=>  5 variables: 2 static and 3 instance

public  double radius;

    public Circle(double radius) { // just need one varibale to initiliaze circle => the others comes from methods
       if (radius<=0) {
           throw new RuntimeException("Radius of the circle negative or zero");
       }
        this.radius = radius;
        area=calculateArea();
        perimeter=calculatePerimeter();
        volume=calculateVolume();
        name="Circle";
        hasVolume=false;
    }

//    static {
//        name="Circle";
//        hasVolume=false;
//    }



    @Override
    public double calculateArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }


    @Override
    public String toString() {
        return "Circle{" + "name: "+ name +
                "\nradius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
