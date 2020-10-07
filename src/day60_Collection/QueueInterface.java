package day60_Collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueueInterface {

    public static void main(String[] args) {


        Queue<Integer> q1=new ArrayDeque<>();
        q1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        q1.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(q1);

      int firstObject=  q1.poll();//FIFO => last real queue => first in first out
        System.out.println(firstObject);
        System.out.println(q1);

        int secondObject=  q1.poll();
        System.out.println(secondObject);
        System.out.println(q1);

//q1.get(2)// there is no index number


//poll()=> removes the first object that is inserted

    }
}
