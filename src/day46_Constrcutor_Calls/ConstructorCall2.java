package day46_Constrcutor_Calls;

import day45_ConstructorCall.Constructor;

public class ConstructorCall2 {

    public ConstructorCall2(){// default
      //  this("s");
        System.out.println("A");
    }

    public ConstructorCall2(int a){  //int constructor
       //this.ConstructorCall2();
       this(); //calling default constructor
        System.out.println("B");
    }

    public ConstructorCall2(String s){

        this(4);

        System.out.println("C");
    }


    public ConstructorCall2(char c){
        this();

        System.out.println("D");
    }

    public ConstructorCall2(double v){

        this(3);
        System.out.println("E");
        //this(9); // called at the first step
    }

    public static void main(String[] args) {


        new ConstructorCall2('c');
    }








}
