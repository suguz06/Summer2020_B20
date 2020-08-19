package day43_Static;

public class Variables {
// outside the method and block==> instance variables

    int d;
    static int e=10;


    public void method2(){
        System.out.println(d); /// takes instance variables
        System.out.println(e); // accept instance or static variables
    }

    public static void main(String[] args) {
        System.out.println(e);
      //  System.out.println(d); d is instcance==> not acceptted in static method
//by creating object we can call instance varaible

        Variables obj=new Variables();
        System.out.println(obj.d); // static only accept static and object=> default values


       // System.out.println(a); //compile error a is a local variable
    }


    public static void method1(){

        int a;   //local variable=> not accesible outside the method

        if(true){
            int b=20;
        }
       // System.out.println(b); not accesible, just should be in block

        //System.out.println(a); gives error since it is not initialized
    }
}
