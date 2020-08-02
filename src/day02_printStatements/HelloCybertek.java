package day02_printStatements;

import java.util.Scanner;

public class HelloCybertek {
    public static void main(String[] args) {

        int number=23, i=2;
        boolean flag=false;

        for (i=2; i< number/2; i++ )
        { if (number%i==0) {
            flag=true;
            break;
        }

        }
        if (flag) {
            System.out.println("number is not prime");
        }else {
            System.out.println("number is prime");
        }



        }
    }

