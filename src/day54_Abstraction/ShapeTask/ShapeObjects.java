package day54_Abstraction.ShapeTask;

public class ShapeObjects {


    public static void main(String[] args) {

        Circle circle=new Circle(6);
        Rectangle rectangle=new Rectangle(2.3, 4.4);
        Square square=new Square(12);
        Triangle triangle=new Triangle(12, 6.8);

        System.out.println("circle.area() = " + circle.area());
        System.out.println("rectangle.area() = " + rectangle.area());
        System.out.println("square.area() = " + square.area());
        System.out.println("triangle.area() = " + triangle.area());
    }
}
