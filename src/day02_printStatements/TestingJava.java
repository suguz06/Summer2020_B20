package day02_printStatements;

/*

 Write a return method that can find the unique characters from the
String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */

/*

Solution 2:
public static String Unique(String str) {
String result ="";
for(String each : str.split(""))
result += ( (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";
return result;
}
 */


/*

S
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;

public class TestingJava {

    public static void main(String[] args) {



        int [] a1={1,2,3,66,90};

        int max=a1[0];
        int min= a1[0];
       for (int each: a1) {
           if(each>max) {max=each;}
           if(min>each) {min=each;}
       }

        System.out.println("max "+ max+ " min "+min);

    }







}



