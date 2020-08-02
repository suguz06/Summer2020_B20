package day20_While;


import java.util.Scanner;

/*
Tasks:
    1. write a program that can print the numbers between 1 to 100.
                if the number is divivible by 3, do not print it
    2. write a program that can ask the user enter a number for five times and the returns the sum of those five numbers
    3. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
            hint: you need an infinite loop
    4. Write a program that can return the factorial number of any given number
        Ex:
            input: 5
            output: 120
            because: 5! = 5 * 4 * 3 * 2* 1 = 120
 */
public class WarmUps {

    public static void main(String[] args) {

//1.
//        for(int i=1; i<=100;++i){
//
//            if (i%3==0) {continue;}
//            System.out.print(i+" ");
//
//        }
//
   //2.  write a program that can ask the user enter a number for five times and the returns the sum of those five numbers

//        Scanner scan=new Scanner(System.in);
//        int result=0;
//        for (int i=1; i<=5; ++i) {
//            System.out.println("Enter number: "+i);
//            int num=scan.nextInt();
//        result +=num;
//
//        }
//        System.out.println("sum of all numbers: " + result);

//3. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
//            hint: you need an infinite loop

//        int result=0;
//
//        for(int i=1; true; ) {
//            Scanner scan=new Scanner(System.in);
//            System.out.println("enter number: ");
//            int num=scan.nextInt();
//
//            if(num>=0) { result +=num;
//
//            } else {break;}
//        }
//
//        System.out.println("sum all positive numbers: "+ result);
//
//
//

//        4. Write a program that can return the factorial number of any given number
//        Ex:
//        input: 5
//        output: 120
//        because: 5! = 5 * 4 * 3 * 2* 1 = 120

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number: ");

        int num=scan.nextInt();
        double factorial=1; // note that more than 100, integer bound exceed then choose double for big numbers

        if (num>=1) {for (int i=1; i<=num;++i) {
            factorial *=i;
        }
            System.out.println(" The factorial of "+ num + " is :"+ factorial);
        } else if(num==0) {
            System.out.println("factorial of zero is 1");
        }
        else{
            System.out.println(" invalid number for factorial...");
        }



    }
}
