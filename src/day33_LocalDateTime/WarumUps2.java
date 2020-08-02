package day33_LocalDateTime;


import java.time.LocalDate;
import java.util.Arrays;

public class WarumUps2 {

    public static void main(String[] args) {

        String [] names={"aa","bb","cc","dd","ee"};
        LocalDate [] birth={LocalDate.of(2010, 1, 1), LocalDate.of(1998, 2, 3),
                LocalDate.of(2010, 1, 1), LocalDate.of(1998, 2, 3),LocalDate.of(2010, 1, 1) };

    String [] a=new String[names.length];
    for (int i=0; i<names.length; ++i) {
        a[i]= names[i]+ " "+ birth[i];
    }
        System.out.println(Arrays.toString(a));

    }
}
