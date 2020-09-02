package Office_Hours.Practice_09_02_2020;

import day45_ConstructorCall.Constructor;

public class Circle {

    public  double radius;
    public double diameter;
    public double area;
    public double perimeter;

    public static double PI;

    static { // just run one times and first order
        PI=3.14;
    }

    public Circle(double radius) {
        this.radius = radius;
        diameter = 2*radius;
      //  PI=3.14; // before calculation is neeed => priority is important
        // it works but ever time again again compile ==> create static block
        area=calculateArea();
        perimeter=calculatePerimeter();

    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }

    private double calculateArea(){
        return PI* radius*radius;
    }
    // For INTERNAL use Only==> cuz private

    private double calculatePerimeter(){
        return 2*PI*radius;
    }  // For INTERNAL use Only==> cuz private
}
