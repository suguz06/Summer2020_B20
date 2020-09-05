package day50_Override.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle=new Circle(3);
        Rectangle rectangle=new Rectangle(3, 4);

        System.out.println(circle.perimeter);
        System.out.println(circle.area);
        System.out.println(circle.calculateArea());

        System.out.println("=================");

        System.out.println(rectangle.calculateArea()); // if override method not given=> parent class gives=> 0
        System.out.println(rectangle.area);
    }



}
