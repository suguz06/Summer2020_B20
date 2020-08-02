package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Times {
    public static void main(String[] args) {

        LocalTime l=LocalTime.of(12, 20, 30,100);

        LocalTime a=      LocalTime.now();


        System.out.println(l + " "+ a);

        LocalTime now=LocalTime.now();
        System.out.println(now);

//       for(int i=0;i<=100; ++i ) {
//           System.out.println(LocalTime.now());
//       }


        LocalDateTime.now();
        System.out.println(LocalDateTime.now());

        LocalDateTime t1=LocalDateTime.of(2020, 7,5,10,25);


        System.out.println(t1);


        LocalDateTime t2=LocalDateTime.now();
        System.out.println(t2);
    }
}
