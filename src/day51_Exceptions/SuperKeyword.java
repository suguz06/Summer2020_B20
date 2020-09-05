package day51_Exceptions;


import Office_Hours.Practice_08_26_2020.test;

class Test{
    int a; //200
    public void method(){
        System.out.println("Hello");
    }

    public void m(){ //u use this keyword for instance=> not use super=> super is used in sublcasss
        this.method();

       // super.method(); //Test (super) class does not have super class
    }

}
public class SuperKeyword extends Test {

    // int a=300
    public void print1(){
        System.out.println(a); //300 // inheriyance a in SuperKeyword
        //System.out.println(this.a);// or just a this.a works
    }

    public void print2(){
        System.out.println(super.a); //200 // from test class => super class insatnce
    }

    public void method2(){
        super.method(); //hello // to reach instance of super instance
        System.out.println("Hola");
    }

    public void method3(){
        this.method2();
        super.method(); //hello
       // System.out.println("Hola");
    }

    public static void main(String[] args) {

        Test obj1= new Test();
        obj1.a=200;

        SuperKeyword obj2=new SuperKeyword();
        obj2.a=300;

        obj2.print1();
        obj2.print2();

        obj2.method2();

        System.out.println("=============");

        obj2.method3();

    }


}
