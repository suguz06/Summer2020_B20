package day02_printStatements;

public class HelloWorld {

    public static void main(String... dd) { // main method
        int age = 120;
        String schoolage = "";
        schoolage = (age < 2) ? "ineligible"
                : (age < 3) ? "toddler" : (age <= 5) ? "early childhood" : (age <= 7) ? "young reader"
                : (age <= 11) ? "elementary" : (age <= 13) ? "middle" : (age == 13) ? "impossible"
                : (age < 17) ? "high school" : (age <= 18) ? "scholar" : "ineligible";
        System.out.print(schoolage);

    }
}


/*

Today we learned Hello World

Struggles are: main method, print statements

date:06/04/2020
 */