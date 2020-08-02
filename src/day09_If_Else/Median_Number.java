package day09_If_Else;

public class Median_Number {

    public static void main(String[] args) {

        int a = 100, b = 2000 , c = 3 ;




        if ((a<b && b<c) || (c<b && b<a) ) {
            System.out.println("median number is : " + b);
        }
        if (( b<c && c<a) ||  (  a<c && c<b ) ) {
            System.out.println("median is: " + c);
        }
        if ( (c<a && a<b) || (b<a && a<c)  )
        {
            System.out.println("median is : " + a);
        }



    }

}
