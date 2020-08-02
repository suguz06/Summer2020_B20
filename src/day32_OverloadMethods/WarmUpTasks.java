package day32_OverloadMethods;


import java.util.Arrays;

/*

Warmup tasks:
    1. write a method that can retunr the full name of a person in reugral format
            ex:
                fullName("cYbErTeK", "SCHOOL"); ==> "Cybertek School"
    2. write a return method that accepts two numbers and an operator, then returns calculation result.
             if the oerator is invalid, return zero
             otherwise return the result
    3. write a method that can add element to an array, the method accepts an array and and a number,
    then returns the new array by appending the number to the last index of the given array
        Ex:
            int[] arr = {1,2,3};
            int num = 4;
            addElement(arr, num); ===> {1,2,3,4}

 */
public class WarmUpTasks {

    public static void main(String[] args) {

       String f= formatFullName(  "cYbErTeK", "SCHOOL");
        System.out.println(f);

       double c= calculator(36, 8, '/');
        System.out.println(c);

        int[] arr = {1,2,3};
        int num = 4;
        int[] ar=addElement(arr, num);
        System.out.println(Arrays.toString(ar));
    }

    //Task 1

    public static String formatFullName(String firstName, String lastName ) {

        String fullName=firstName.toUpperCase().substring(0, 1)+firstName.toLowerCase().substring(1)+" "+
                lastName.toUpperCase().substring(0, 1)+lastName.toLowerCase().substring(1);

return fullName;

    }

     //Task2

    public static double calculator(double num1, double num2, char operator) {

        double result= operator=='*' ? (num1*num2): (operator=='/')? num1/num2: operator=='-' ?
                num1-num2: operator=='+'? num1+num2: operator=='%'? num1%num2: 0;
        return result;
    }

    //Task3

    public static int[] addElement(int[] arr, int num) {
        int[] arr1=new int[arr.length+1];
        int i=0;
        for(int each: arr) {
            arr1[i]=each;
            ++i;
        }
        arr1[arr.length]=num;
        return arr1;

    }


}
