package day23_Array;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter two numbers ");
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            System.out.println("Enter the math operator");

            char o = scan.next().charAt(0);

//            double result = (c=='+')? num1+num2:(c=='-')? num1-num2:
//                    (c=='*')? num1*num2 :(c=='/')? num1/num2:
//                            (c=='%')? num1%num2: 0;
//

            double result = (o == '+')? num1+num2 :( o == '-')? num1-num2 :(o =='*')? num1 * num2
                          :( o == '/')? num1/num2  :(o=='%')? num1%num2 : 0;
                          System.out.println(result);

//
//            double result = 0;
//            switch (c) {
//                case '+':
//                    result = num1 + num2;
//                    break;
//                case '-':
//                    result = num1 - num2;
//                    break;
//                case '*':
//                    result = num1 * num2;
//                    break;
//                case '/':
//                    result = num1/num2;
//                    break;
//                case '%':
//                    result = num1 % num2;
//                    break;
//                default:
//                    System.out.println("invalid math operator");
//                    result = 0;
//                    break;
//
//
//            }

            System.out.println("result= " + result);
            System.out.println("Do u want to continue? ");
            String answer = scan.next(); // String answer = scan.next().toLowerCase;

            while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid answer: please re-enter; yes or no");
                answer = scan.next();
            }

            if (answer.equalsIgnoreCase("no")) {
                break;
            }
        }
        System.out.println("Thanks for using calculator"); //if use Sytem.
    }
}
