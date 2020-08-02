package day24_Array;

import java.util.Scanner;

/*

      1. write a program that can find the unique characters from a String
    Ex:
    input: aabccd
    output: bd
 */
public class Frequncy1 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String st=scan.next();

        //duplicate remove
        String dup="";
        for(int i=0; i<=st.length()-1;++i) {
        if(! dup.contains(st.charAt(i)+""))
        {dup +=st.charAt(i)+"";}
    }
        System.out.println(dup);

        //frequency
        String freResult="";
        String uniChar="";
        for(int j=0; j<=dup.length()-1;++j ) {
            char ch=dup.charAt(j);
            int count=0;
            for(int i=0; i<=st.length()-1;++i)  {

                if(st.charAt(i)==ch) {
                    count++;
                }

            }
            // print the requirements
            if(count==1) uniChar +=ch;
            freResult +=ch+ " :"+count+ " ";
        }
        System.out.println("frequency result "+freResult);
        System.out.println("uni chars "+uniChar);



    }

}
