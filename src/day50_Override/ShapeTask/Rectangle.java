package day50_Override.ShapeTask;

public class Rectangle extends Shape{

    public double width;
    public double length;

    public Rectangle(double width, double length){
        this.width=width; // instance from class
        this.length=length;
        area=calculateArea();  // comes inheritance => instance variable
        perimeter=calculatePerimeter(); //comes inheritance => instance variable

    }



     public double calculateArea(){
        return  width*length;
    }


    public double calculatePerimeter() {
        return 2*(length+width);
    }
}
