package day55_Abstraction.ShapeTask;

public class ShapeObjects {
    public static void main(String[] args) {


        Circle circle=new Circle(5);

        System.out.println(circle.calculateArea());

        System.out.println("circle.calculatePerimeter() = " + circle.calculatePerimeter());

        System.out.println("circle = " + circle);


        System.out.println("================");

        Rectangle rectangle=new Rectangle(12, 5);
        System.out.println("rectangle = " + rectangle);

        System.out.println("======");

        Cylinder cylinder=new Cylinder(2, 3);

        System.out.println("cylinder = " + cylinder);

        System.out.println(circle.hasVolume);

//        Circle circle1=new Circle(-1);
//        System.out.println(circle1);

        Rectangle rectangle1=new Rectangle(2, -5);
        System.out.println(rectangle1);
    }
}
