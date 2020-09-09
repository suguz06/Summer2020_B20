package Office_Hours.Practice_09_08_2020;

public class Data {

  private int a=100;

    private static void method1() {

    }

    public void method2(){ // same class call private varable and methods

        System.out.println(a);
        method1();

    }


}


class  Test{

    public static void main(String[] args) {
        Data obj1=new Data();

        //System.out.println(obj1.a);  // not access => private inside class

       // obj1.method1();  // not accesss private method

        obj1.method2();

    }
}
