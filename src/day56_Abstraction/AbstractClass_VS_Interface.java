package day56_Abstraction;

 //interfca=> advantage many implementtaions added (no one as extended a class)

public abstract class AbstractClass_VS_Interface {


    int a;
    static int b;
    private int c; //use any accMod for variables in Abstract CLASS

   public void  Method1(){ //instance method
       System.out.println(a);
   }


   public static void method2(){ //static method is OK in Abstract class

   }

   abstract void method3(); // it is mandatory absract keyword in Abstract class
    //no method body


    public AbstractClass_VS_Interface(int a) { //constructor OK
        this.a = a;
    }

    static { //static block is OK
        b=300;
    }

    {
        a=3;  //instance block is OK
    }

    //abstract class=> all regular class + absract methods


    public static void main(String[] args) {
        double b=Math.PI; //final variables UPPER letters
        double c=Integer.MAX_VALUE; //final not changed
        double d=Integer.MIN_VALUE; //final => not re-assigned
    }

}



interface A{ // RECOMMENDED=> ONLY ABSRACT METHOD=> pure absract method

    //int a; // only variable is static=> NO INSTANCE
    int a=10; //only accMod=> PUBLIC STATIC and FINAL

   // int c; // yo shoul initilazie by final variable


//   public void method1(){ //no instance method allowed
//
//   }

//
//    static { //no static block since it is initilaxed when variable created
//
//    }
//
    static void method2() { //static method

    }


    abstract void method3();
    abstract void method3(int c); // overloaded is OK
   void method3_2(); // no neeed give absratc=> pure absraction in Interface

    default void method4(){ //default method OK // public access modofiers

    }

//    public A(){ //interface can not have a constructor
//
//    }



}