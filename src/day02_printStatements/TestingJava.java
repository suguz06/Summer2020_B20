package day02_printStatements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestingJava {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 1; i < 6; i++){
            list.add(i);
        }

        System.out.println(list);

        ArrayList<Integer> reversedList = new ArrayList<>();
        for( int i = list.size()-1;  i >= 0; i--){
            // int eachNum = list.get(i);  // unboxing
            reversedList.add( list.get(i) );
        }

        System.out.println(reversedList);
        Collections.reverse(list);

        System.out.println(list);
    }


}
