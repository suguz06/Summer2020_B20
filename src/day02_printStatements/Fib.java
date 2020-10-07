package day02_printStatements;

public class Fib {

    // 0  1 => 1 =>2=>3=>5
//fib(1)=0, fib(2)=1, fib(3)=1, fib(4)=2,.....

    public static int fibonacci(int a) {

        int c1=0;
        int c2=1;
        int c3=0;

        for (int i = 2; i <= a ; i++) {
            c3=c1+c2;
            c1=c2;
            c2=c3;
        }
        return c3;
    }

    public static void main(String[] args) {
        System.out.println("fibonacci(3) = " + fibonacci(3));
    }
}
