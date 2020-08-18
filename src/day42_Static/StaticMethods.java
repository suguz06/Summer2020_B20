package day42_Static;

public class StaticMethods {



    int a=100;
    static int b=19;

    public static void main(String[] args) {

        System.out.println(b);
       // System.out.println(this.a);


        StaticMethods obj1=new StaticMethods();
        System.out.println(obj1.a);
        /*
        the only way to call instance in a static methos
         */

        staticMethod();
       // instanceMethod();
        obj1.instanceMethod();  /// thorugh object use


        StaticMethods.staticMethod();
      //  StaticMethods.instanceMethods(); no

    }



    public static void staticMethod() {

    }


    public   void instanceMethod() {

    }

}




