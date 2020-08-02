package day10_if_if;

/*
grade:
    90 ~ 100 ==> A
    80 ~ 89 ==> B
    70 ~ 79 ==> C
    60 ~ 69 ==> D
    otherwise ==> F

 */

import java.util.Scanner;

public class grade_Calculator {

    public static void main(String[] args) {

int score=50;

String grade="";

grade= (score>=90 &&score <= 100 ? "A": (score>=80 && score<= 89 ? "B": (score>=70&& score<=79 ? "C": (score>=60&& score<=69? "D": "F"    )       )   ));


        System.out.println(grade);
    }



}




