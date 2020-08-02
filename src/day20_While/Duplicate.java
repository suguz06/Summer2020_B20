package day20_While;

import java.util.Scanner;

public class Duplicate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter word: ");
        String str = scan.nextLine();

        String result = ""; /// 11222


        int a = str.length();
        int i = 0;
        while (i < a) {
            if (str.contains("" + str.charAt(i))) {
                continue;
            }
            result += str.charAt(i);
            i++;
        }
        System.out.println(a);
        System.out.println(result);
    }
}
