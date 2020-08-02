package day30_CustomMethods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Prac2 {

    public static void main(String[] args) {

        DateTimeFormatter a=DateTimeFormatter.ofPattern("MMM/dd/yyyy EEEE hh:mm a");


       LocalDateTime ldt= LocalDateTime.of(2019, 5, 20, 16, 30);

        System.out.println(ldt.format(a));

    }
}
