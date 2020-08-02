package day24_Array;
/*
3. Write a program that can return the average number
 from an array of integers
            ex: [1,2,3]
            average: 2
            [10, 15, 5, 6]
            average: 9
            [4, 5, 6, 7, 8, 10, 20, 30, 0]
            average: 10
 */
public class Avarage {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,50,51};

        double sum=0;
        int size=arr.length;
        for(int i=0; i<=arr.length-1;++i) {
            sum +=arr[i];
        }
        System.out.println(sum/size);

        System.out.println(10/3);
        System.out.println(10/(double)3);
        System.out.println(10/3);
        System.out.println(10/3.0);

    }


}
