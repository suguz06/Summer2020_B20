package day33_LocalDateTime;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Prac3 {

    public static void main(String[] args) {

        String[] students = {"Ayse", "Ali", "Veli", "Deli", "Zeki"};
        LocalDate[] birthDays = {
                LocalDate.of(1999, 2, 3),
                LocalDate.of(1988, 3, 4),
                LocalDate.of(1999, 5, 4),
                LocalDate.of(2004, 12, 3),
                LocalDate.of(1978, 3, 4)
        };

        // Odina: May/23/80 Monday


        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MMM/dd/yy EEEE");
        for (int i=0;i<students.length; ++i){
            System.out.println(students[i]+ " :" +birthDays[i].format(dtf));
        }
    }
}
