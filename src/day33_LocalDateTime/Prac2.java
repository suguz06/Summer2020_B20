package day33_LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Prac2 {



    public static void main(String[] args) {

        DateTimeFormatter a=DateTimeFormatter.ofPattern("MMM/dd/yyyy EEEE hh:mm a");


        LocalDateTime ldt= LocalDateTime.of(2019, 5, 20, 16, 30);

        System.out.println(ldt.format(a));


        LocalDateTime.now();

        System.out.println(LocalDateTime.now().format(a));

        DateTimeFormatter aa=DateTimeFormatter.ofPattern("EEEE hh:mm:ss a");

        //saturday 4:3:45 pm
        LocalDateTime rigthNow=LocalDateTime.now();

        System.out.println(rigthNow.format(aa));
        System.out.println(rigthNow);


    }
}

