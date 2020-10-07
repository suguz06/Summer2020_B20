package day59_OOPReview;

import day55_Abstraction.ShapeTask.Circle;
import day55_Abstraction.ShapeTask.Rectangle;
import day55_Abstraction.ShapeTask.Shape;

public class Polymorphism {


    public static void main(String[] args) {
        Shape shape1=new Circle(3);

        //shape1.radius => reference type does not find radius

        Circle circle1=(Circle)shape1; //downCasting=> super to subclass

        System.out.println("circle1.radius = " + circle1.radius);



        // shape1.length;


        //check => classCastExecption
     //  System.out.println(  (Rectangle)shape1);

        Rectangle r1=new Rectangle(2, 3);

        Shape shape2=(Shape)r1; // upcasting


    }




}
