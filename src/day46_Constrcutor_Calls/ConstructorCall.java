package day46_Constrcutor_Calls;

public class ConstructorCall {

    public ConstructorCall() {
        method1();
        method2();

    }

    public static void method1() {
        method2();
      //  ConstructorCall();
    }


    public static void method2() {
        method1();
    }

    public void method3(){
        //ConstructorCall();
    }
}
