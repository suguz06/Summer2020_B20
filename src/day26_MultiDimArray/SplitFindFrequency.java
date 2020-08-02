package day26_MultiDimArray;

import java.util.Arrays;

/*
2. write a program that can return the number of
appearances of “java” and “python” anywhere in the sentence
            ex:
                input: I love Java, Python is cool
                output: 1 Java 1 Python
                input: Java Java Python Python Python
                output: 2 Java 3 Python

 */
public class SplitFindFrequency {


    public static void main(String[] args) {

        String sentence = "I python JavaJava love Java, java Java, Python is cool JavaScript";

        String[] arr = sentence.split(" ");

        System.out.println(Arrays.toString(arr));


        int countJava = 0;
        int countPhyton = 0;

        //to ignorecase sensitibvity toLowerCase is good
//         for (String each : arr) {
//            if (each.toLowerCase(contains("java"))) countJava++;
//           if (each.toLowerCase(contains("python"))) countPhyton++;
//        }
//

        for (String each : arr) {
            if (each.contains("Java")) countJava++;
            if (each.contains("Python")) countPhyton++;
        }


        System.out.println("Java : " + countJava);
        System.out.println("Python : " + countPhyton);

/*
str=JavaScript

str.equals(Java) ==> false
str.contains(Java)++> true

then we use contains method

 */


    }
}
