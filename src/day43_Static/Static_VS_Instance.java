package day43_Static;

public class Static_VS_Instance {


    static int staticVariable; // 1 copy
    int instanceVariable; // if create two object=> 2 copy


    public static void main(String[] args) {

        Static_VS_Instance obj1= new Static_VS_Instance();
        obj1.instanceVariable=3;
        obj1.staticVariable=500;

        Static_VS_Instance obj2= new Static_VS_Instance();
       // obj2.instanceVariable=5;
        obj2.staticVariable=400; //last one is common=> just one copy

        System.out.println( obj1.instanceVariable);

        System.out.println( obj2.instanceVariable); //if we did not initiazed =>defalut zero

        System.out.println("===============");

        System.out.println(obj1.staticVariable); //not preferred by calling object the static
        System.out.println(obj2.staticVariable);



        Static_VS_Instance.staticVariable=600; //by calling class name : most prefeered

        System.out.println(Static_VS_Instance.staticVariable);

    }



}
