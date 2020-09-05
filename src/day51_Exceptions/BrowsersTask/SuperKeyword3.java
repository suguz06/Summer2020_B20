package day51_Exceptions.BrowsersTask;


// note=> constructor not inherited
// just call by super() keyword

// defaul super class constructor is implicitly( automatically)
// ==> if not call manually first by super()
class C{

    public C(int a){ //if default implicitly call => int type you call manually
        System.out.println("super class int arg constructor");
    }

}


public class SuperKeyword3 extends C{ //sub class has to call a contructor from super class

//    public void method(){ //we need to call constructor=> constructor call another constructr
//        super(300);
//    }
//


    public SuperKeyword3(int a){
        super(10);
        System.out.println("sub class constructor int arg");

    }

    public static void main(String[] args) { // first super class constructir then subclass
         new SuperKeyword3(20);

    }

}
