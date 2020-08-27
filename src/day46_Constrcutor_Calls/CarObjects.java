package day46_Constrcutor_Calls;

public class CarObjects {

    public static void main(String[] args) {


        System.out.println(new Car("Toyota"));


        System.out.println("==================");

        System.out.println(new Car("BMW","x5"));

        System.out.println("========");

        System.out.println(new Car("Nissan", "Altima", "white"));

        System.out.println("========");

        System.out.println(new Car("Honda", "Accord", "Black",2020));

        System.out.println("========");

        System.out.println(new Car("Mercedes", "CLK", "white",2019,68500.20));


    }
}
