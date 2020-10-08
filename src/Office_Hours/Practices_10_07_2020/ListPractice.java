package Office_Hours.Practices_10_07_2020;

import java.util.*;

public class ListPractice {


    public static void main(String[] args) {


        //List<String> list=new LinkedList<>(); //fastest one is linkedList
        // List<String> list=new Vector<>(); // slowest
        // List<String> list=new Stack<>(); // slowest

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Nurbiye", "Emine", "Davud", "Emine", "Emine"));
        // 0          1        2      3        4
        System.out.println("list = " + list);
        System.out.println("list.get(2) = " + list.get(2));


        Stack<String> stack = new Stack<>();
        stack.addAll(list);
        System.out.println("stack = " + stack);
        stack.pop(); // LIFO=> pop action is removed last index element
        System.out.println(stack);
        stack.pop(); // LIFO=> pop action is removed last index element
        System.out.println(stack);
        String pop = stack.pop();
        System.out.println("pop = " + pop);
        System.out.println(stack);
    }
}
