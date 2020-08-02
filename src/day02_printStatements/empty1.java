package day02_printStatements;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class empty1 {

    public static void main(String[] args)
    {
        ArrayList<Boolean> b=new ArrayList <> ();

        b.add(false);b.add(true); b.add(true);

        repeatAL(b);
    }
    //create your method below
    public static void repeatAL(ArrayList<Boolean> b) {
        ArrayList<Boolean> c = b;
        c.addAll(b);
        System.out.println(c); }
}



