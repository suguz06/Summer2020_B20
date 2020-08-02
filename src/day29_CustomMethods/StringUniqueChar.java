package day29_CustomMethods;

/*
Write a program that can print out the unique
 values from a String Array
            Ex:
                if arr -> {"A", "A", "B", "C", "C"}
                output: B
                if arr -> {"A", "B", "B", "C"}
                output:  A
                         C
            MUST use for each loop
 */
public class StringUniqueChar {

    public static void main(String[] args) {

        String arr[] = {"A", "A", "B", "C", "C"};


        //method 1 by each char
        int count = 0;
        String a = "A";
        for (String each : arr) {
            if (each.equalsIgnoreCase(a)) count++;
        }
        System.out.println(count);


//method 2
        for (String ab : arr) //get each element
        {
            int count1 = 0;
            for (String each : arr) {
                if (each.equals(ab)) count1++;
            }
            if (count1 == 1) System.out.println(ab);
        }


    }
}
