package day08_LogicalOperators;

public class IfStatement {


    public static void main(String[] args) {

        int a=10;
        int b=10;


        if(a>b) {

            System.out.println( a+ " is the largest number");
        }
        if(b>a) {

            System.out.println( b+ " is the largest number");
        }

        if(a == b) {

            System.out.println( a+ " equal to  "+ b);
        }
    }
}
