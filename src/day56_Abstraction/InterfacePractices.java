package day56_Abstraction;

public  interface InterfacePractices { //not final=> otherwise no inherited absratc methods

    // in the interface==> variables are static => not instance since no object created interface
    int a=100; // by default=> public and static

   // public static final => you write or not
   public static final int b=300; // by default all variables=> final static and final


    abstract void Method2();// abstract method no code body=> and accsees modifier by default PUBLIC

     static void method1(){// default ==> PUBLIC is given by default
         System.out.println(a); //static only accept static
        System.out.println("b = " + b);

      //a=200;  // it is final=> can not re-assign it
        //b=2; //not re-assign => since final
    }


    //INTERFACE+> All variables=> by default=> PUBLIC STATIC FINAL

    // Abstract CLASS+> static or instance variable any specific

  static void main(String[] args) { //static method

}

 public default void method2(){ //default method

}

//public void method3(){ //no instance method =>NO INSTANCE METHOD IN INTERFACE
//
//}

//    public InterfacePractices(){  // no constructor in InterFACE
//
//    }

    public abstract  void method5(); //abstract method in Interface

 /// interface we dont need to use abstract   => check by no code body
    void method6(); //abstract method interface=> no need absract keyword and public AMods
// interface is the place of pure abstraction=> no need to give abract keyword and check by empty body=> IT IS ABSTRACT METHOD

// static {  //no static block interface => it is final variable => no reassign again in block
//
// }

//
//    { //no instance block
//
//    }

    // instance varibales=> NO  in Interface

}
