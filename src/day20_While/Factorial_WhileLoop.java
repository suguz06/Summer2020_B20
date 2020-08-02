package day20_While;

import java.util.Scanner;

public class Factorial_WhileLoop {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num=scan.nextInt();
        double fac=1; int i=1;

//        do {fac *=i;
//        i++;}
//        while(i<=num);


//        while(i<=num) {
//            fac *=i;
//            i++;
//        }

        while (num>=1)
        { fac *=num ;
        num--;}
        System.out.println(fac);





    }
}
