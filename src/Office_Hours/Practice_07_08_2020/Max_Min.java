package Office_Hours.Practice_07_08_2020;

import java.util.Scanner;

public class Max_Min {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter");
        int num = scan.nextInt();
        int i = 1;
        int max = num;
        int min = num;
        while (i <= 4) {
            System.out.println("enter");
            int num1 = scan.nextInt();
            if (num1 > max) {
                max = num1;
            }
            if (num1 < min) {
                min = num1;
            }

            ++i;
        }
        System.out.println("max is "+ max  + " min is "+ min);






    }
}
