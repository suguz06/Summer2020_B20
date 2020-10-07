package day60_Collection;


import java.util.*;

public class ListInterface {

    //Accept duplicates => preserve order

    public static void main(String[] args) {

// List reference=> 4 class create object=> Arraylist, linkedlist, vector and stack
        //polymorphism => list interface => all have behaviours
        List<Integer> list1 = new ArrayList<>(); //get add remove set removeAll size contains

        // ArrayList internally use array=> it is faster retrieve element by using get method
        // More used then due to fast
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5)); //ctrl+D => automatic copy

        System.out.println(list1);
        System.out.println("ArrayList " + list1.get(2)); //fastest get element since using array structure

        list1.add(6);


        List<Integer> list2 = new LinkedList<>(); //get add remove set removeAll size contains
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(list2);
        System.out.println("LinkedList " + list2.get(2));

        list2.add(6); //linkedList more faster to add and remove method
        //LinkedList is faster since each objects are doubly linked


        List<Integer> list3 = new Vector<>(); //get add remove set removeAll size contains
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5));


        System.out.println(list3);
        System.out.println("Vector " + list3.get(2));


        list3.add(6); //LinkedList is faster since each objects are doubly linked


        List<Integer> list4 = new Stack<>(); //get add remove set removeAll size contains
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5));
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(list4);
        System.out.println("Stack " + list4.get(2));

        list4.add(6);

//list4.pop(); //reference type is decided what we reach

        //downCasting  and grouping => then call pop()
        ((Stack) list4).pop();
        System.out.println(list4);


        System.out.println("=====================");
//LIFO=> last in First Out ==> POP() => it gives last element added and  remove it

        Stack<Integer> list5 = new Stack<>();
        list5.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        System.out.println(list5);

        int lastObject1 = list5.pop();
        System.out.println(list5);

        int lastObject2 = list5.pop();
        System.out.println(list5);

        //pop()==remove(lastIndexElement)


        list5.removeAll(Arrays.asList(1, 4, 5));
        System.out.println(list5);

        int lastObject3 = list5.pop();
        System.out.println(lastObject3);

        System.out.println("================================");

        //list of list

        int[] arr1 = {1, 2, 3, 4}; //1D array
        int[][] arr2 = {{1, 2, 3, 4}, {4, 5, 6, 7}}; //multiDimensional =>2D
        //Array is not a class

        ArrayList<String> l1 = new ArrayList<>();

        l1.add("S");


        ArrayList<ArrayList<Integer>> l2 = new ArrayList<>(); //list of list

//        l2.add(5)  => it accepts arraylist of Integer
//        l2.add("M")
        l2.add(new ArrayList<>(Arrays.asList(1, 2, 3, 4))); //add 1 arrayList


        l2.add(new ArrayList<>());

        l2.get(1).addAll(Arrays.asList(5, 6, 7, 8, 9));

        l2.get(0).removeAll(Arrays.asList(1, 3));

        System.out.println(l2); //add second arrayList
        System.out.println(l2.size()); //size 1=> since we add one

        System.out.println("Size of first arrayList: " + l2.get(0).size());
        System.out.println("Size of second arrayList: " + l2.get(1).size());

        System.out.println("================");

        List<String> group1 = new ArrayList<>(Arrays.asList("A1", "B1", "C1", "D1", "E1"));
        List<String> group2 = new ArrayList<>(Arrays.asList("A2", "B2", "C2", "D2", "E2"));
        List<String> group3 = new ArrayList<>(Arrays.asList("A3", "B3", "C3", "D3", "E3"));
        List<String> group4 = new ArrayList<>(Arrays.asList("A4", "B4", "C4", "D4", "E4"));
        List<String> group5 = new ArrayList<>(Arrays.asList("A5", "B5", "C5", "D5", "E5"));

        List<List<String>> groups = new ArrayList<>();
        groups.addAll(Arrays.asList(group1, group2, group3, group4, group5));

//OR
//        groups.addAll(Arrays.asList( //Stack class also work
//                new Stack<>(),
//                new Stack<>(),
//                new Stack<>(),
//                new Stack<>(),
//                new Stack<>()
//
//
//
//
//        ));

        System.out.println(groups);


        for (List<String> each : groups) {
           // System.out.println(each );
            for (String s : each) {
                System.out.print(s +"  " );
            }

        }

//        for (int i = 0; i < groups.size(); i++) {
//            System.out.println(groups.get(i));
//            List<String> a=groups.get(i);
//            for (int j = 0; j < groups.size(); j++) {
//                System.out.println(a.get(j));
//
//            }
//
//        }


    }

    public void method1() {

    }


    public synchronized void method2() { //vector class method ALL synchronized keyword=> thread safety
// advantage=> thread safe
        //disadvantage=> slower => other threads waits theirs
    }
}
