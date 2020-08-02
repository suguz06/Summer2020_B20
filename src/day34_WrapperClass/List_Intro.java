package day34_WrapperClass;


import java.util.ArrayList;

public class List_Intro {
    public static void main(String[] args) {
/*
ArrayList=>>
 */

        ArrayList <Integer> score=new ArrayList<>();

        score.add(95);//95 primitive autoboxing to class Integer
    score.add(1,20); //autoboxing 1
    score.add(25); // autoboxing 2
        score.add(32);
        score.add(4, 12);
        System.out.println(score);

        //get(index)  elements
        score.get(0); //get the 0 index element
        System.out.println(score.get(1)); //get index 1 element



    }
}
