package day46_Constrcutor_Calls;

public class ConstructorCall3 {


    public ConstructorCall3( ) {

    }


    public ConstructorCall3(int a){
        this();
        System.out.println("Y");

    }

    public ConstructorCall3(double a){
       // this();  // gives error two constructor  RULE_> just one call
        this(3);
    }


    public void method1(){ // instance method
        //ConstructorCall3(); no call by name
        //this(); call this but just another constructor method
    }









}

