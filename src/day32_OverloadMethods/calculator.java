package day32_OverloadMethods;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number:" );
        double num1=scan.nextDouble();
        System.out.println("Operator:" );
        char op=scan.next().charAt(0);
        System.out.println("Enter second number:" );
        double num2=scan.nextDouble();

       double result= calculator(num1, calculator(num1, num1, '*'), '+');

        System.out.println(result);
    }



    public static double calculator(double num1, double num2, char operator) {

        double result= operator=='*' ? (num1*num2): (operator=='/')? num1/num2: operator=='-' ?
                num1-num2: operator=='+'? num1+num2: operator=='%'? num1%num2: 0;
        return result;
    }

}


