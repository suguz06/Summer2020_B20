package day47_Encapsulations;

public class Constructor {


    static {
        System.out.println("static block"); //one times execute
    }
    public Constructor (int a){ //existing contructor is one parameter
       // this("A"); since string=>double=> int => hence itself

        //this(10); // not called itself
        //this(10.0) // not repeated => not call repeatedly
        System.out.println("int arg");
    }

    //by overloading we can create as many constructors

    public Constructor(double a){
        this(10); // call int arg=> First => print int arg
        System.out.println("double arg"); // second print=> double arg
        //this(10); give error, since it gives first=> it has priority
  //Constructor(10) ==> not call by name=> use this()

    }

    public Constructor(String a){
        this(10.0);
        System.out.println("String arg");
    }




    public static void main(String[] args) {

       // new Constructor(); compile errror=> since one param neeeded

       // new Constructor(10); // ok, one object

        //new Constructor(10.0); // 2 object complier 2 times

new Constructor("A"); // call string=> call double=> int double String



    }
}
