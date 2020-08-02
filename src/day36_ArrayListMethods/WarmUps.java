package day36_ArrayListMethods;

import java.util.ArrayList;

/*
warmup tasks:
    1. write a program that can set the last element of the Integer arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
    2. write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
    3.  write a program that can find the unique elements from an ArrayList of integers and stores into another list called uniques
            ex: list==> {1,1,2,3,3,4,5}
                uniques ==> {2,4,5}

 */
public class WarmUps {

    public static void main(String[] args) {
//Task1
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println(al);
        al.set(al.size()-1, 0);
        System.out.println(al);
//Task2
        for(int i=0; i<=al.size()-1;++i) {
            if(i%2==0) al.set(i,2*al.get(i)) ;
        }
        System.out.println(al);


        //ex: list==> {1,1,2,3,3,4,5}
        //                uniques ==> {2,4,5}
        // Task3

        al.clear();
        al.add(1); al.add(1);al.add(2); al.add(3); al.add(3); al.add(4); al.add(5);
        System.out.println(al);
        //String re="";
        ArrayList<Integer> alist= new ArrayList<>();
        for(int a: al){
            int c=0;
            for(int b:al) {
                if(a==b) c++;
            } if(c==1) alist.add(a);
        }
        System.out.println(alist);


    }
}
