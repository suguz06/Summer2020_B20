package Office_Hours.Practice_09_23_2020;

public class Square extends  Shape {

    public double edge;

    public Square(double edge) {
        //super(); no need to call=> compiler implicitly call no arg constructor
        if(edge<=0){
            throw new RuntimeException("edge can not be zero or  less than zero");
        }
        this.edge = edge;
        area=calculateArea();
        perimeter=calculatePerimeter();


    }

    @Override
    public double calculateArea() {
        return edge*edge;
    }

    @Override
    public double calculatePerimeter() {
        return 4*edge;
    }


    @Override
    public String toString() {
        return "Square{" +
                "edge=" + edge +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

//    @Override
//    public double calculationVolume() {
//        return 0;
//    }
}
