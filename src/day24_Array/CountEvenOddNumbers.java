package day24_Array;

/*
4. Write a program that can count the even
and odd number from an array of integers

 */
public class CountEvenOddNumbers {

    public static void main(String[] args) {


        int[] arr = new int[100];




        int count = 0;
        int count1 = 0;

        for (int i = 0; i <= arr.length - 1; ++i) {
            arr[i] = 2*i + 1;
            if (arr[i] % 2 == 0) {
                count++;
            } else {
                count1++;
            }
        }
        System.out.println("even numbers of array: "+ count);
        System.out.println("odd numbers of array: "+ count1);
    }
}
