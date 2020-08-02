package day14_recap;

import java.util.Scanner;

public class nextLine_VS_rest {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);



        System.out.println("Enter your full name: ");
        String name=scan.nextLine();

        System.out.println("Enter your company: ");
        String name1=scan.next();

         scan.next();

        System.out.println("Enter your age: ");
        int age=scan.nextInt();



        System.out.println("your full name: "+ name + " age: "+ age );

    }
}
