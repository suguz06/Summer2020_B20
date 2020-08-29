package day02_printStatements;

/*
 Write a return method that check if a string is build out of the same
letters as another string.
Ex: same("abc", "cab"); -> true , same("abc", "abb"); -> false:

 */





import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestingJava {

    public static String[] combineNames(String[] first_names, String[] last_names)
    {
        // write your codes here
        String [] ar=new String[first_names.length];
        for (int i=0; i<=first_names.length-1; ++i) {
            ar[i]= first_names[i]+last_names[i];

        }
        return ar;


    }



    public static void main(String[] args)
    {
        //feel free to test code here
        String[]	first_names = {"Bulent","Ebrahim"};
        String[] last_names = {"Pola","Emam"};
        System.out.println(Arrays.toString(combineNames (first_names, last_names)));

    }


}



