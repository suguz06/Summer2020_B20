package day35_ArrayList;


import java.util.ArrayList;

/*
list of integers to reverse order
 */
public class ReverseOrder {

    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
        System.out.println(al.size());
        al.add(1); al.add(2); al.add(3); al.add(3,4);
        System.out.println(al);

        for(int i=al.size()-1; i>=0; --i) {
            System.out.print(al.get(i)+ " ");
        }

    }
}
