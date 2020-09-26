package day58_Polymorphism;

import day55_Abstraction.ShapeTask.Circle;
import day55_Abstraction.ShapeTask.Cylinder;
import day55_Abstraction.ShapeTask.Rectangle;
import day55_Abstraction.ShapeTask.Shape;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

public class InstanceOfKeyword {

    public static void main(String[] args) {


        Animal animal1=new Animal(10, 'F');
        Animal animal2=new Dog("Ala", 4, 'M');
        Animal animal3=new Cat("Kiko", 2, 'M');

        //verify animal3 is a ojbect of Animal class

      boolean r1=  animal3 instanceof Animal;// IS A relation==> true

        System.out.println(r1);

        //verfiy animal3 is the object of Cat class

         boolean r2 = animal3 instanceof Cat;

        System.out.println(r2);

        //verify animal3 is the object of Dog class

        boolean r3 = animal3 instanceof Dog; //there is no IS A relaton=> false

        System.out.println(r3);

        boolean r4 = animal2 instanceof Animal; //Dog is Animal=>True

        System.out.println(animal1 instanceof Dog); //Animal is a Dog=> false
        //super class element never be an elemnt of sub class


        System.out.println(animal2 instanceof Cat); //Dog is a Cat

        Cylinder cylinder=new Cylinder(2, 3);

        Shape shape1=new Circle(2);
        Shape shape22=new Circle(3);
        Shape shape2=new Rectangle(2, 3);
        Shape shape3=new Cylinder(2, 5);
        identifyShape(shape1);
        identifyShape(shape2);
        identifyShape(shape3);

        System.out.println("equalShapes(shape1, shape22) = " + equalShapes(shape1, shape22));
    }



    //custom method to identify the given shape
   public static void identifyShape(Shape shape) {

        if(shape instanceof Circle) {
            System.out.println("The shape is a circle");
        } else if(shape instanceof Cylinder) {
            System.out.println("The shape is cylinder");
        } else  {
            System.out.println("The shape is rectangle");
        }

   }

   public static boolean equalShapes(Shape shape1, Shape shape2) { //Shape class has no radius=> then call Circle class by casting (Circle)

        if (shape1 instanceof Circle && shape2 instanceof Circle) {
            if(((Circle) shape1).radius==((Circle) shape2).radius) {
                return true;
            }
        }
       if (shape1 instanceof Cylinder && shape2 instanceof Cylinder) {
           if(((Cylinder) shape1).height==((Cylinder) shape2).height && ((Cylinder) shape1).radius==((Cylinder) shape2).radius) {
               return true;
           }
       }

       if (shape1 instanceof Rectangle && shape2 instanceof Rectangle) {
           if(((Rectangle) shape1).width==((Rectangle) shape2).width && ((Rectangle) shape1).length==((Rectangle) shape2).length) {
               return true;
           }
       }
       return false;

   }





}

