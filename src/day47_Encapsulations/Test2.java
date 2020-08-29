package day47_Encapsulations;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class Test2 {


    static int a=200;

    static {
        a=300;
    }

    public Test2(){
        a=400;
    }

    public Test2(int a){
        a=500;

    }

    public static void main(String[] args) {
        System.out.println(  a); //=> for static=> no object yet=> 300

        new Test2(); // for object created=> 400
        System.out.println(a);

        new Test2();
        a=600;
        System.out.println(a); // a constructor=> last step value=>600
    }
}
