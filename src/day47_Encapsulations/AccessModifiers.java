package day47_Encapsulations;

public class AccessModifiers {

 //public, access any package or class  Every where reach !!!
    public static int publicVariable=100;

    public static void publicMethod(){
        System.out.println("public method");
    }

    //default => since you dont give public protected private
    //default=>  just accessible within the same package

    static int defaultVariable=200;

    static void defaultMethod(){
        System.out.println("default method");
    }

    //private ;; only visible/accsess within the same class
    // some secure datas==>> exp: long SSN (no share outside the class)

    private static int privateVariable=300;

    private static void privateMethod(){
        System.out.println("private method");
    }


    public static void main(String[] args) {


        publicMethod();
        System.out.println(publicVariable);

        defaultMethod();
        System.out.println(defaultVariable);

        privateMethod();
        System.out.println(privateVariable);


    }


}

