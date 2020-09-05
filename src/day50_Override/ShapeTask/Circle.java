package day50_Override.ShapeTask;

public class Circle extends Shape {
    /*
      2. create sub classes of Shape:
                        Circle
                        Rectangle
                        Square
             give the instance variables that are needed to calculate the Area, perimeter, of those shapes

     */

    public double radius;
    public double diameter;
    public static double PI=3.14;

    public Circle(double radius){
        this.radius=radius;
        diameter=2*radius;
        area=calculateArea();
        perimeter=calculatePerimeter();

    }


    public double calculateArea(){
        return PI*radius*radius;

    }

    public double calculatePerimeter(){
        return 2*PI*radius;
    }

}
