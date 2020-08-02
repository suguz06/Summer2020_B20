package day24_Array;


/*
 3. Create an int array called numbers that has length
 of 100 and Assign 1-100 to each index of the array.
 then print out all the even numbers. MUST use continue statement

 */
public class Array100Even {

    public static void main(String[] args) {

        int[ ] arr= new int[100];
        for(int i=0; i<=arr.length-1;++i ) {
            arr[i]=i+1;
           if(arr[i]%2 !=0) {continue;
           } System.out.println(arr[i]);
        }







    }
}
