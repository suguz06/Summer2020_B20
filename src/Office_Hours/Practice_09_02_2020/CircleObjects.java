package Office_Hours.Practice_09_02_2020;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class CircleObjects {

    public static void main(String[] args) {

        DecimalFormat df=new DecimalFormat("0.00");

        Circle circle1=new Circle(3);
        Circle circle2=new Circle(5);
        Circle circle3=new Circle(6);


        Circle[] circles={
                new Circle(7), new Circle(8)
        };

        ArrayList<Circle> circleArrayList=new ArrayList<>();

        circleArrayList.addAll(Arrays.asList(circle1,circle2,circle3));
        circleArrayList.addAll(Arrays.asList(circles));

        System.out.println(circleArrayList.size());
        System.out.println(circleArrayList);

        //System.out.println(circle1.calculateArea()); ==> private method => con not reach here
        System.out.println(df.format(circle1.area));

        System.out.println("circle1.perimeter = " + circle1.perimeter);
       // System.out.println(circle1.calculatePerimeter());
        System.out.println("==================");
        System.out.println("circle1.PI = " + circle1.PI);

        Circle  circle4=new Circle(5);
        System.out.println("circle4.radius = " + circle4.radius);
        System.out.println("circle4.PI = " + circle4.PI);
        System.out.println("============");
        System.out.println(new Circle(10).area);




    }
}
