package day50_Override.WarmUp;

public class Circle {


    public static double pi=3.14;
    public  double radius;


    public Circle(double radius){
        this.radius=radius;
    }

 public double calculateArea() {
     return  3.14 * this.radius * this.radius;

 }

    public double calculatePerimeter() {
        return  2*3.14 * this.radius;

    }

}
