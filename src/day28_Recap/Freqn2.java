package day28_Recap;

import java.util.Scanner;

public class Freqn2 {

    public static void main(String[] args) {


        String str="Catcatcatcatdogdogpythonpython".toLowerCase();


        int count=0;


        for(int i=0; i<str.length()-3;++i) {

          if( str.substring(i, i+3).equals("cat") )
          count++;



        }

        System.out.println(count);



        int count1=0;


        for(int i=0; i<=str.length()-6;++i) {

            if( str.substring(i, i+6).equals("python") )
                count1++;



        }

        System.out.println(count1);


        Scanner scan=new Scanner(System.in);
        System.out.println("enter string");
        String str1=scan.nextLine();
        System.out.println("enter a word");
        String word=scan.nextLine();
        int a=word.length();

        int count2=0;


        for(int i=0; i<=str1.length()-a;++i) {

            if( str1.substring(i, i+a).equalsIgnoreCase(word) )
                count2++;



        }

        System.out.println(count2);


    }
}
