package Office_Hours.Practice_09_23_2020;

public class Cube extends Shape implements Volume {

    public double edge;

    public Cube(double edge) {

        if(edge<=0){
            throw new RuntimeException("edge can not be zero or  less than zero");
        }
        this.edge = edge;
        area=calculateArea();
        perimeter=calculatePerimeter();
        volume=calculationVolume();
    }

    @Override
    public double calculateArea() {
        return 6* edge*edge;
    }

    @Override
    public double calculatePerimeter() {
        return edge*4*6;
    }


    @Override
    public double calculationVolume() {
        return Math.pow(edge, 3);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "edge=" + edge +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
