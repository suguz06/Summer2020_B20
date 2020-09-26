package InterviewQA;

public class RemainderWithoutOperation {

    /*
    /10.Can you write a method which finds
// remainder of 2 numbers without using the % operator?
     */


    public static int remainder(int a, int b) {
        int c = 0;
        while (a >= b) {
            a = a - b;
            c++;
        }
        return a; // c is quotient result   a=b*c+remainder

    }

    public static void main(String[] args) {

        System.out.println("remainder(6, 2) = " + remainder(6, 2));
        System.out.println("remainder(11, 3) = " + remainder(11, 3));
    }
}
