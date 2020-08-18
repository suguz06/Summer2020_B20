package day42_Static;

class Test{

    int a;
    static int b;
}




public class StaticVariables {

    public static void main(String[] args) {

        Test ob1= new Test();
        ob1.a=5;
        ob1.b=20;

        Test obj2=new Test();

        obj2.a=10;
        obj2.b=30;

        System.out.println(ob1.a); //5
        System.out.println(obj2.a);//10

        System.out.println(ob1.b); //30

        System.out.println(obj2.b);//30pi


    }
}
