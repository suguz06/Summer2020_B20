package day33_LocalDateTime;

import java.text.DecimalFormat;

public class FormatDecimal {

    public static void main(String[] args) {
        DecimalFormat df=  new DecimalFormat("0.00");
//format 0.00=>check third number>=5 add second+1, <5 just as it is


        double a=22/7.0;
        System.out.println(a);
        System.out.println(df.format(a));
        System.out.println(df.format(1.2544444));
        System.out.println(df.format(6));



    }


}
