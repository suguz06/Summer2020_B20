package day30_CustomMethods;
/*
step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop
 */
public class PositiveMethodForEach {

    public static void main(String[] args) {


        int[] arr={1,3,0,-4,-5,12};

        isPos(5);
        isPosArr(arr);
    }


    public static void isPos(int num) {

        String result= num>0? num+ " is Positive": num<0? num+ " is Negative": num+ " is Zero";
        System.out.println(result);
    }

    public static void isPosArr(int [] arr) {

        for(int a: arr) {
            isPos(a);

        }

    }






}
