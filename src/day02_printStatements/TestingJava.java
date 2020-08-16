package day02_printStatements;

import javax.swing.text.html.HTMLDocument;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TestingJava {

    public static void main(String[] args) {
 String s="AAAABBBEECCCC";

        System.out.println(FrequencyOfChars(s));
    }

    public static String FrequencyOfChars(String str) {
        String nunDup = "";
        String expectedResult = "";
        for (int i = 0; i <= str.length() - 1; i++) {
            if (!nunDup.contains("" + str.charAt(i))) {
                nunDup += "" + str.charAt(i);
            }
        }
        //System.out.println(nunDup);
        for (int j = 0; j <= nunDup.length() - 1; j++) {
            int count = 0;
            char ch = nunDup.charAt(j);
            for (int k = 0; k <= str.length() - 1; k++) {
                if (str.charAt(k) == nunDup.charAt(j)) {
                    count++;
                }

            }expectedResult += nunDup.charAt(j)  +""   + count +" ";
        }
        return expectedResult;
    }


}



