package Office_Hours.Practice_09_23_2020;

public class Objects {

    public static void main(String[] args) {

        //Shape shape=new Shape() => abstract class can not create an object
        Square square=new Square(10);

        System.out.println(square);

        System.out.println("================");

        Cube cube=new Cube(10);

        System.out.println("cube = " + cube);
        System.out.println("cube.perimeter = " + cube.perimeter);
        System.out.println("cube.calculatePerimeter() = " + cube.calculatePerimeter());

        System.out.println("cube.volume = " + cube.volume);

    }
}
