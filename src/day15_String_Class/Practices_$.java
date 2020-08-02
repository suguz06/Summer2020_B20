package day15_String_Class;

import org.omg.CORBA.WStringSeqHelper;

public class Practices_$ {

    public static void main(String[] args) {
        String lastName="school";

        String firstChar= lastName.substring(0, 1).toUpperCase();
        String remainning=lastName.substring(1).toLowerCase();

        String sss= 'a'+"c"+"b"+1+"yyy"+true;

        System.out.println(firstChar+ ""+ remainning+ sss);
        System.out.println();
    }

}
