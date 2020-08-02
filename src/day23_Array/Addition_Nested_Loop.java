package day23_Array;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/*
1. write a program that ill ask user to enter two numbers and calculates
the sum of those two numbers.
then it asks the user if he/she wants to continue
                    if the answer is yes, repeat the whole process again
                    if the answer is no, only return the addition
                    but while the anser is not a valid answer (not yes or no), the the program should repeatedly ask the user re-enter
            HINT: nested loop task, outter loop need to be an infinite loop

 */
public class Addition_Nested_Loop {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       while (true) {
           System.out.println("Enter two numbers ");
           int num1 = scan.nextInt();
           int num2 = scan.nextInt();

           int result = num1 + num2;
           System.out.println("sum= "+result);
           System.out.println("Do u want to continue? ");
           String answer = scan.next(); // String answer = scan.next().toLowerCase;

           while ( !(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
               System.out.println("Invalid answer: please re-enter; yes or no");
           answer=scan.next();}

if(answer.equalsIgnoreCase("no")) {break;}
       }
        System.out.println("Thanks for using calculator"); //if use Sytem.exit(0) no printing=> us break;
    }
}
