package day34_WrapperClass;

import java.util.Scanner;

public class WrapperClasses_Practices2 {

    public static void main(String[] args) {

        int max = Integer.MAX_VALUE;

        System.out.println(max);

        byte bmax = Byte.MAX_VALUE;
        System.out.println(bmax);

        int min=Integer.MIN_VALUE;
        System.out.println(min);

        System.out.println("=====");

//         Scanner scan=new Scanner(System.in);
//        //find max for 5 numbers and print
//
//        int maxx=Integer.MIN_VALUE;
//
//        System.out.println("Enter 5 numbers");
//
//        for(int i=1; i<=5;++i) {
//            System.out.println("Enter   number");
//            int num=scan.nextInt();
//
//            if(num>maxx) maxx=num;
//        }
//
//        System.out.println(maxx);

        char c=Character.MAX_VALUE;
        char c1=Character.MIN_VALUE;
        System.out.println(c);
        System.out.println(c1);
    }
}
