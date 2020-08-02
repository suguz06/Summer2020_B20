package day24_Array;

import day19_For_Loop.BreakStatement;

public class UniqueLetters {

    public static void main(String[] args) {

        String str="aabccddekklytt";

        String uni=""; // b

        for(int i=0; i<=str.length()-1; i++) {
            char ch=str.charAt(i);
            int first= str.indexOf(ch);
            int last=str.lastIndexOf(ch);
            if(first==last) uni +=ch;

        }
        System.out.println(uni);



    }
}
