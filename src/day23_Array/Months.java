package day23_Array;

import java.util.Scanner;

public class Months {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        String[] months={"Jan","Feb", "March", "April", "May", "June",
        "July", "August", "Sept", "Oct", "Nov", "Dec"};

        System.out.println("Enter a number for month");
        int monthNumber=scan.nextInt();


        System.out.println(months[monthNumber-1]);


        System.out.println("============");


    }
}
