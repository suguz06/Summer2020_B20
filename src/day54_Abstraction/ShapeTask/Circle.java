package day54_Abstraction.ShapeTask;

public class Circle extends  Shape{


    double radius;

    public Circle(double radius) {
         this.radius=radius;
    }


    @Override
    public double area() {
        return radius*radius*Math.PI;
    }
}
