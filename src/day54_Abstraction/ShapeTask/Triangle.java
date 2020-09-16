package day54_Abstraction.ShapeTask;

public class Triangle extends  Shape{


    public double base;
    public double height;

    public Triangle(double base, double height) {
        this.base=base;
        this.height=height;
    }


    @Override
    public double area() {
        return height*base*0.5;
    }
}
