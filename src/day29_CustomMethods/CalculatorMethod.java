package day29_CustomMethods;

public class CalculatorMethod {


    public static void calculator(double num1, double num2, char operator) {

        double result=0;
        double result1=0;
        switch (operator) {
            case '+': result=num1+num2; break;

            case '*':result=num1*num2;break;
            case '-':result=num1-num2; break;
            case '/':result=num1/num2; break;
            case '%':result=num1%num2; break;
            default:
                System.out.println("invalid");
        }
        System.out.println(result);

        // for each loop

        result1= operator=='+'? num1+num2: operator=='*'?
                num1*num2: operator=='-'?num1-num2:operator=='/'?
                num1/num2: operator=='%'?num1%num2:0 ;
        System.out.println(result1);

    }


    public static void main(String[] args) {
        calculator(12, 25, '.');
    }











}
