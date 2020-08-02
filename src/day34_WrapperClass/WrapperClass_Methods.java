package day34_WrapperClass;

public class WrapperClass_Methods {

    public static void main(String[] args) {


        String s = "123"; //how to convert number=> by parseInt
        int a=Integer.parseInt(s);

        System.out.println(s+1);
        System.out.println(a+1);



        Double d= Double.parseDouble("7.6"); //autoboxing=> primitive assign to Object class wrapper
        double d1=Double.parseDouble("7.6"); // kickboxing:)
        System.out.println(d-1);

        String s1="TRue"; // parse no need case sen=> ignore case sensitivity
        Boolean b=Boolean.parseBoolean(s1); // primitive assign object
        boolean b1=Boolean.parseBoolean(s1);

        System.out.println(!b); //check boolean or not=> !
        System.out.println(!b1);

        System.out.println("====================");

        //Double Character Integer Boolean==> Most use for Wrapper Class


        String s3="10000.5";
        double dd=Double.valueOf(s3); //return wrapper class

        System.out.println(dd*2); // check it double or text

String ee="FalsE";

Boolean bb=Boolean.valueOf(ee); // class to class
boolean bbb=Boolean.valueOf(ee); // unboxing: class=> primitive

        System.out.println(!bb);
        System.out.println(!bbb);

    }
}
