package day45_ConstructorCall;

public class Sum {

    public Sum(int a, int b) {
        System.out.println(a + b);
    }

    public Sum(double a, double b) {
        System.out.println(a + b);
    }

    public Sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public Sum(double a, double b, double c) {
        System.out.println(a + b + c);
    }


    public static void main(String[] args) {
        Sum ob = new Sum(10, 20);
        Sum ob1 = new Sum(20.5, 30.4);
        Sum ob2 = new Sum(10, 30, 40);
        Sum ob3 = new Sum(12.2, 10.3, 52.1);

        new Sum(10, (int)2.1); //casting
        //new Sum(); gives errror==> u must initialize

    }
}