package day20_While;


import java.util.Scanner;

public class WhileLoop_Duplicate {

    public static void main(String[] args) {

//
//        if (true) {
//            System.out.println("Hello");
//        }
//
//        System.out.println("=====================");
//
//        while (true) {  //while loop is repeated if condition
//            System.out.println("hello");
//        }
///// write 1-10 using while loop

        Scanner scan = new Scanner(System.in);
        System.out.println("enter word: ");
        String str = scan.nextLine();

        String result = ""; /// 11222
        int a = str.length();
       // int i = 0;

        for (int i=0; i<a;++i) {

            if(!result.contains(""+str.charAt(i)))
            {result +=str.charAt(i);}

        }
//        System.out.println(result);

//        while (i < a) {
//            if (str.contains("" + str.charAt(i))) {
//                continue;
//            }
//            result += str.charAt(i);
//            i++;
//        }
        System.out.println(a);
        System.out.println(result);

    }
}
