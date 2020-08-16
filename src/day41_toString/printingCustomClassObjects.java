package day41_toString;
//toString() methods
public class printingCustomClassObjects {


    public static void main(String[] args) {


String str=new String("cybertek");

        System.out.println(str.toString()); //object name
        System.out.println(new String("School").toString()); // object
        System.out.println("==============");


        Carpet2 c1=new  Carpet2();
        c1.customOrder(5, 6, 3, true);

        System.out.println(c1);
    }
}
