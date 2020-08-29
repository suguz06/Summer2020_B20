package day47_Encapsulations;

public class Test {

    //same package==> no need to import just call class name
    public static void main(String[] args) {

        AccessModifiers.publicMethod();
        System.out.println(AccessModifiers.publicVariable);

        AccessModifiers.defaultMethod(); //default is accessible within the pakcage
        System.out.println(AccessModifiers.defaultVariable);

        // AccessModifiers.privateMethod;  //private is not visible outside class
        // System.out.println(AccessModifiers.privateVariable);

        Encapsulations obj1 = new Encapsulations();
        // System.out.println(obj1.ssn); // no access since private data

        obj1.setSsn(1233); // set new value or modify/write
        System.out.println(obj1.getSsn());


    }
}
