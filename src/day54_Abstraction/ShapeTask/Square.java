package day54_Abstraction.ShapeTask;

public class Square extends  Shape{

    public double edge;

    public Square(double edge){
        this.edge=edge;
    }


    @Override
    public double area() {
        return edge*edge;
    }
}
