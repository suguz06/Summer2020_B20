package day24_Array;

import java.util.Arrays;

public class UniqueForEACH {
    public static void main(String[] args) {


        int arr[] = {1, 1, 2, 4, 4,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int each:arr) {
            int a=each;
             int count=0;

            for (int each1: arr) {
                int b=each1;
                 if(b==a) count++;

            } if(count==1)  System.out.println("uniques integers "+ a);


//


    } }
}
