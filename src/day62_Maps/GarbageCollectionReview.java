package day62_Maps;

import day55_Abstraction.ShapeTask.Circle;
import day55_Abstraction.ShapeTask.Rectangle;

public class GarbageCollectionReview {
    public static void main(String[] args) {

        String str1="Cybertek"; //GC eligible for Garbage collector
        str1=null;

        System.out.println(str1);

//finalize() => implicitly called GC

        String s1=new String("John");
        String s2=new String("Aaron");

        s1=s2; //s2 is assigned for s1=> s1 is unreferenced now
//John is eligible for GC

        System.out.println(s1+ " "+s2);

        System.out.println("====================");

        Circle c1=new Circle(2); //GC
        c1=null;

        System.out.println(c1);

        Rectangle r1=new Rectangle(10, 20);
        Rectangle r2=new Rectangle(1, 2);

        r1=r2; // rectange r1 is eligible for GC

        System.out.println(r1); // same rectangles // done by finalize() method
        System.out.println(r2);

        System.out.println("====================");

        String a1="Cybertek"; // a1 is no longer reference object after null
        a1=null; //a1 is eligible for GC in JVM

        System.out.println("============");

        /* in selenium=> every test driver closed=> driver assigned null
        driver.close(); => driver=null;
         */


    }
}
