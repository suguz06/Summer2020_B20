package day02_printStatements;

 class A{
     protected  void AA(){
         System.out.println("A");
     }
 }

 class B extends A{
     public void AA(){
         System.out.println("C");
     }
     public  void BB(){
         System.out.println("B");
     }
 }

public class cardealer {

    public static void main(String[] args) {
 A o=new B();
 o.AA();
    }
}
