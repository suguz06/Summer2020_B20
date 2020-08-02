package Office_Hours.Practice_06_17_2020;

import java.util.Scanner;

public class Ascending_Order_five {


    /*

       Assignment:
        write a program that asks to enter 5 numbers and prints the numbers in ascending order
                Ex:
                    5, 4, 1, 2, 3
                 output:
                    1, 2, 3, 4, 5
         */

    public static void main(String[] args) {


        int count, temp;

        //User inputs the array size
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements you want in the array: ");
        count = scan.nextInt();

        int num[] = new int[count];
        System.out.println("Enter array elements:");
        for (int i = 0; i < count; i++)
        {
            num[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < count; i++)
        {
            for (int j = i + 1; j < count; j++) {
                if (num[i] > num[j])
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("Array Elements in Ascending Order: ");
        for (int i = 0; i < count ; i++)
        {
            System.out.print(num[i] + ", ");
        }
       //System.out.print(num[count - 1]);

    }
}
