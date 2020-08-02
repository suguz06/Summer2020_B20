package day09_If_Else;

/*
warmup tasks:

    1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
    2. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
    3. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
    4. write a java program that can identify if a person is eligible to buy alcohol

 */


public class Warm_Up_Task<a> {
    public static void main(String[] args) {


        int a = 100, b = 200, c = 300;

        if (a>b && a>c) {
            System.out.println("maximum number is : " + a);
        }
        if (b>a && b>c) {
            System.out.println("maximum is: " + b);
        }
        if (c>b && c>a) {
            System.out.println("maximum is : " + c);
        }


    }

}
