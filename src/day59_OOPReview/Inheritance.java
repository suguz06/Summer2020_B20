package day59_OOPReview;


class A{  // just only default type is OK in same Class=> NO Protected NO Privare


    private int a=100;

    int b=200;
    protected int c=300;
    public int d=400;

    private void method1(){

    }

    void method2(){

    }

    protected void method3(){
        System.out.println("Hello world");
    }
    public void method4(){}

}





public class Inheritance extends A{

    @Override
    protected void method3(){// Acs Modifier=> same or more visible
        System.out.println("Hello Cybertek");
    }


    public static void main(String[] args) {

        Inheritance obj=new Inheritance();
       // System.out.println("obj.a = " + obj.a); // private cannot inherited
        System.out.println("obj.b = " + obj.b); // default called in same package
        System.out.println("obj.c = " + obj.c); //protected ok
        System.out.println("obj.d = " + obj.d); //public ok

    //obj.method1(); // no private=> can not called different class
        obj.method2();
        obj.method3(); // if different implementation exists=> it gives
        obj.method4();


    }


}
