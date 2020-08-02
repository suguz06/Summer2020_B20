package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatting {

    public static void main(String[] args) {
        DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("  MMMM/dd/yyyy, EEEE");
/*
        year: yy, yyyy
		Month: MM(number), MMM(three letters), MMMM(full Name)
		days: dd
		days name: E(three letters), EEEE(full name)
 */
        LocalDate ld=LocalDate.of(2020, 7, 25);

        System.out.println(ld);
        System.out.println(ld.format(dateFormat));
        System.out.println(LocalDate.now().format(dateFormat));

        LocalTime now=LocalTime.now();
        System.out.println(now);

    /*
        hours: hh
		minutes: mm
		seconds: ss
		am/pm: a
     */


        DateTimeFormatter timeFormat=DateTimeFormatter.ofPattern("HH:mm:ss a");
        System.out.println(LocalTime.now().format(timeFormat));


        // May/20/2019 Dayname 4:30 pm

    }
}
