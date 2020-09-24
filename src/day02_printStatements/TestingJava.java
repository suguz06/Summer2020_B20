package day02_printStatements;



public class TestingJava    {


    public static void main(String[] args) {


        int a=5;
        Integer b;
        b=a; //auto => primitive assign => object

        int c;
        c=b;//unbox => object=> primitive

        Integer d=b; //kickbox


        System.out.println(b);
        System.out.println("c = " + c);


    }

}
















