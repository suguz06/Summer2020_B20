package day59_OOPReview;


interface X { //meant to be inherited=> no FINAL

    public abstract void method1();

    void method2();
    int a=1; //by default it is static, final and ONLY PUBLIC is accsModifier
    static int b=2; // but we have to initiliaze right away=> since it is FINAL


//    X() { //constructor is not OK
//
//    }


//    static { //no static block=> it is assingned right away in variables
//
//    }
}


abstract class Y { //meant to be inherited=> no FINAL
//variables=> instance or static => OK
    int a=1; //no need to initiliaze
    static int b=2;
    public abstract void method1();


    Y() { //constructor is OK

    }
}

public class Abstraction {

    public static void main(String[] args) {
        // Y o1=new Y() ; //no  object in Y
        //X o2=new X() ;   //no  object in Y

    }
}



