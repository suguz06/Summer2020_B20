package day55_Abstraction;

public class AbstractClassVS_regularClass {







}


final class A{ // all things here // but cannot have absract method
    int a=10;
    static int b=20;

    public void method1(){

    }
    static {

    }

    public A(){

    }

   // public abstract void method3(){

    }



 abstract class B{ // can not final // all accepted + abstratc method
    int a=10;
    static int b=20;

    public void method1(){

    }
    static {

    }

    public B(){

    }

    public static void method2(){

    }

    public abstract void method4();

}
