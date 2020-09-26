package InterviewQA;
/*
///7.In fibonacci series, next number is the sum of previous two numbers
// for example 0, 1, 1, 2,     3, 5, 8, 13, 21, 34, 55,  89,  144,……...
// The first two numbers of fibonacci series are 0 and 1.
// Given a number num, print n-th Fibonacci Number.
// the question is asking about the fibpnacci
 */
public class fibonacci {
    public static void main(String[] args) {

        System.out.println("fibonacci(4) = " + fibonacci(4));
        System.out.println("fibonacci(0) = " + fibonacci(0));

        System.out.println("===========");
        for (int i = 2; i <20 ; i++) {
            System.out.println("fibonacci("+i+") = " + fibonacci(i));

        }
    }


    public static int fibonacci(int n) {
        if(n==0){
            System.out.println("fibonacci(0)=0");
        }
        if(n==1){
            System.out.println("Fibonacci(1)=1");
        }
        if (n < 0) {
            System.out.println("no fiboncacci number, give number >=0");
        }

        int a = 0;
        int b = 1;
        int c=0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;

        }


        return  c;
    }
}
