package day53_finalKeyword;

import java.time.LocalDate;
import java.time.LocalTime;

public class FinalVariable {


    final static String eyeColor = "Brown";
    final String bloodType = "A";

    final int x; //final variable=> must initliaze right away=>   if not initilzae gives complile error
    final static int y; //right away initialize

    static {
        y = 300; // initliaze in static block
    }


    public FinalVariable(){ // constructor  initlizae the instance variable
        x=700;
    }



    public static void main(String[] args) {


        final LocalDate dateOfBirth = LocalDate.of(2000, 5, 7);


        //  dateOfBirth=LocalDate.of(1990, 6, 8); //final can not be changed ==>final

        System.out.println(dateOfBirth);


        final long ssn = 123456;
        //ssn=9878454

        System.out.println(ssn);

        final double PI = 3.14;
        //PI = 2.24; // this is not be re-assigned => final
        System.out.println(PI);


        final char gender = 'M';
        //gender='F';

        final String birthPlace = "USA";
        //birthPlace="England";

        final int a; //local
        //System.out.println(a); // should be initilaze


    }
}
