package day29_CustomMethods;

public class UnuqieElements {

    public static void uniques(String [] arr ) {

        for(String a: arr) {
            int count=0;

            for(String b:arr) {


                if(a.equalsIgnoreCase(b)) count++;

            } if (count==1) System.out.print(a);

        }
        System.out.println();



    }

    public static void main(String[] args) {

        String arr[]= {"A", "B", "C", "A"};
        uniques(arr);
        System.out.println("hello");

        String arr2[]= {"A", "C", "C", "D"};
        uniques(arr2);

        PalindromeTest.palindrome("Selman");
    }




}
