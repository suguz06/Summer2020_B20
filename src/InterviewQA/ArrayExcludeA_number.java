package InterviewQA;

import java.util.Arrays;

public class ArrayExcludeA_number {

    /*
    /8.Write a method that takes an
// array of integers between 1 and 10 (excluding one number)
// and returns the missing number.EX: missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5
     */




    public static int missingNumber(int [] a){
        Arrays.sort(a);
        int missingNumber=1;
        for (int i = 0; i < a.length; i++) {
             if(a[i]!=i+1) {
                 missingNumber=i+1;
                break;
             }

        } return missingNumber;



    }


    public static void main(String[] args) {

        int [] a1={1,2,3,4,5,6,8,9,10};
        int [] a2={1,2,  4,5,6,7,8,9,10};
        int [] a3={2,3,  4,5,6,7,8,9,10};


        System.out.println("missingNumber(a1) = " + missingNumber(a1));
        System.out.println("missingNumber(a2) = " + missingNumber(a2));
        System.out.println("missingNumber(a3) = " + missingNumber(a3));
    }
}
