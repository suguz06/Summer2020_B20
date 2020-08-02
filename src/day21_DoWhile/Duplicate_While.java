package day21_DoWhile;

import java.util.Scanner;

public class Duplicate_While {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        System.out.println("enter word 122: ");
//        String str = scan.nextLine();
//        String result = ""; /// 11222
//        int i = 0;
//        int a = str.length();
//        String s=""+str.charAt(i);
//        while(i < a) {
//            if(str.contains(s)) {continue;}
//            else {result +=str.charAt(i);}
//            ++i;
//        }
//
//        System.out.println(result);
//        System.out.println(result);
//        System.out.println(result);

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();   // "nal"

        String result = ""; //"nal"

        for (int i = 0; i <= str.length() - 1; i++) {

            String s = "" + str.charAt(i);  //s: n, a, l, a, n
            /*
                if(result.contains(s)){
                    continue;
                }else{
                    result += s;
                }
             */

            if (!result.contains(s)) {
                result += s;
            }

        }

        System.out.println(result);


    }
}
