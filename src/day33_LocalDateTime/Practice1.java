package day33_LocalDateTime;

import java.time.LocalDate;

public class Practice1 {


    public static void main(String[] args) {

        String[] students = {"Ayse", "Ali", "Veli", "Deli", "Zeki"};
        LocalDate[] birthDays = {
                LocalDate.of(1999, 2, 3),
                LocalDate.of(1988, 3, 4),
                LocalDate.of(1999, 5, 4),
                LocalDate.of(2004, 12, 3),
                LocalDate.of(1978, 3, 4)
        };

        for (int i=0; i<= students.length-1; ++i) {
            System.out.println(students[i]+ " : "+ birthDays[i]);
        }

        System.out.println("=======");

        for(LocalDate each: birthDays) {
            if(!each.isLeapYear()) continue;
            System.out.println(each);
        }



    }
}
