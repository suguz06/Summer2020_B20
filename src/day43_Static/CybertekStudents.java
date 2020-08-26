package day43_Static;

class A{
    static int a=20;
}



public class CybertekStudents {

    String studentName;
    int age;
    char gender;

    static String schoolName="Cybertek School";

public  static void getInfo(){

   // System.out.println("Name"+ studentName); //name is instance
    System.out.println("School name" +schoolName);
}


    //for the advantages of static => 1. call by class name 2. less memory and common value
    public static void main(String[] args) {
        System.out.println(A.a);
    }



}
