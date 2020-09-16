package day53_finalKeyword;



//final
class  A{ //instance method overriding //  final means no subclasses

//final method not overrrding=> the others is ok

    //Any method other than constructor can be final


//    public final A(){  // constructor no take any specifoer or return type
//
//    }




    public final void method1(){
        System.out.println("Enter user name and password");
    }

    private final void method1(int a){ // every method is overloaed ==> final method also overloaded
        System.out.println("Enter user name and password");
    }


    public final static void method2(){ // static method can be static

    }

}


public class FinalMethod extends  A {

//@Override     ===>>> final method can not be overriding since no permissin to implementattion
//    public void method1(){ // override => any diffrent implementatuions
//    System.out.println("Enter something else");
//    }


    public final static void main(String[] args) { // main method also final=>> 2 specifiers static and final
        System.out.println("Hello");
    }

}
