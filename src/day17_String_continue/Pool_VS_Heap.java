package day17_String_continue;

public class Pool_VS_Heap {

    public static void main(String[] args) {


        String s1 = "Cybertek"; //String pool
        String s2 = "Cybertek"; //String pool
        //one object is created
        System.out.println(s1 == s2); //true ==> one object

        String s3 = new String("Cybertek");
        System.out.println(s1 == s3);

        String s4 = new String("Cybertek");
        System.out.println(s4 == s3);


    }

}
