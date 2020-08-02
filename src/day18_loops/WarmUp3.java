package day18_loops;


import java.util.Scanner;

/*
4. write a program that can calculate the sum of all numbers between 1 to 100
    5. write a program that can calculate the sum of all the even numbers between 1 ~ 100
    6. write a program that can calculate the sum of all the odd numbers between 1 ~ 100
    7. write a program that can calculate the sum of all numbers between 1 to any given number
        ex:
            input: 100
            output: 5050
            input: 50
            output: 1275
            input : 200
            output : 20100

 */
public class WarmUp3 {


    public static void main(String[] args) {

        //4.
//int sum=0;
//        for (int i=1; i<=100;++i) {
//            sum +=i;
//
//        }
//        System.out.println(sum);
////        //5.
//        int sumEven=0;
//        for (int i=2; i<=100;i+=2) {
//            sumEven +=i;
//
//        }
//        System.out.println(sumEven);
////        //6.
//        int sumOdd=0;
//        for (int i=1; i<=100;i+=2) {
//            sumOdd +=i;
//
//        }
//        System.out.println(sumOdd);
//        //7.
//
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to all 1 to this number summation: ");
        int sumNum = scan.nextInt();
        int sum = 0;

        if (sumNum>1) {
        for (int i = 1; i <= sumNum; i++) {
            sum += i;
        }
        System.out.println(sum); }
        else {
            System.out.println("invalid entry: ");
        }


    }
}
