package day50_Override;

public class Test extends AccessModifiers {

    public static void main(String[] args) {

        System.out.println(Test.publicData);
        System.out.println("Test.protectedData = " + Test.protectedData);
        System.out.println("Test.defaultData = " + Test.defaultData);
        //System.out.println("Test.privateData = " + Test.privateData);
    }
}
