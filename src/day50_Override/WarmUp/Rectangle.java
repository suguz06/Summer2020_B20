package day50_Override.WarmUp;

public class Rectangle {


    public  double width;
    public  double length;

    public Rectangle(double width, double length) {
        this.width=width;
        this.length=length;
    }

    public double calculateArea() {
        return  this.width*this.length;

    }

    public double calculatePerimeter() {
        return  2* (this.width+this.length);

    }
}
