package day51_Exceptions;

class X{
    public X(){
        System.out.println("X");
    }
}

class Y extends  X{
    public Y(){
        //super() => implicity by compiler=> gives X
        System.out.println("Y"); // Y
    }
}

class Z extends Y{
    public Z(){
        //super() = implicitly call by Y()
        System.out.println("Z");
    }
}


public class Practice {

    public static void main(String[] args) {

        new Z();// it calls respectively==> must call by orderly super classes
        // X Y Z

    }



}
