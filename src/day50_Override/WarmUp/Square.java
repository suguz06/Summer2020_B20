package day50_Override.WarmUp;

public class Square  {

public double side;


    public Square(double side) {
        this.side = side;
    }


    public double calculateArea() {
        return  side*side;

    }

    public double calculatePerimeter() {
        return  4*side;

    }

}
