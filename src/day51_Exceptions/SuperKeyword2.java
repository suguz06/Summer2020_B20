package day51_Exceptions;


class B{


    public B() {
        System.out.println("Super class default constrcutor");
    }
}





public class SuperKeyword2 extends  B{


    public SuperKeyword2() { // we create own
        super(); // (when default ==>> implicitly comes from super class // call the super class constructor
        // not default constructor=> you call manually
        System.out.println("sub classes default constructor");
   // super(); order is important

    }


    public static void main(String[] args) {


        new SuperKeyword2();

    }
}
