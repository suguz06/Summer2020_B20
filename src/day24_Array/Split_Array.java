package day24_Array;


import java.util.Arrays;

/*
split(value) => returs String value, split the string by given values

String sentence=
 */
public class Split_Array {

    public static void main(String[] args) {

String sentence="Java is cool";
        String [] x=sentence.split(" "); //[Java, is, cool]

        System.out.println(Arrays.toString(x));

        String reverse="";
        for( int i =x.length-1; i>=0;--i) reverse +=x[i]+ " ";

        System.out.println(reverse);

        System.out.println("===============");

        String s="JAVA";
        String[] a=s.split("");
        char [] b=s.toCharArray();
        System.out.println(Arrays.toString(a)); //each elements string
        System.out.println(Arrays.toString(b)); //each elements char




    }

}
