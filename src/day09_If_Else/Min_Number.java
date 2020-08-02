package day09_If_Else;

public class Min_Number {

    public static void main(String[] args) {

        int a = 1000, b = 2000, c = 300;

        if (a<b && a<c) {
            System.out.println("minimum number is : " + a);
        }
        if (b<a && b<c) {
            System.out.println("minumum is: " + b);
        }
        if (c<b && c<a) {
            System.out.println("minimum is : " + c);
        }


    }
}
