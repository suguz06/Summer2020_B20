package day23_Array;
   /*
        3 main data structures
        1- array
        2- collection
        3- map

        variable declaration

        int a=1;
        String names="selman", "ali"' just one name is allowed

        Array variable; a variable can have multiple data

        declare \\

        datatype[] arrayName= { data1,data2  ,.....  , };

        initializing data

        datatype[] name= new datatype[size];
         */

public class Array_Practice {

    public static void main(String[] args) {

        String[] students = {"ali", "veli", "seli"};

        for (int i = 0; i <= 2; ++i) {
            System.out.println(students[i].charAt(i));
        }
        System.out.println("-==============---------");

        int[] scores = {85, 70, 95, 90, 100};
        String[] names = {"Mike", "Adam", "tom", "John", "amy"};

        for (int i = 0; i <= 4; ++i)
            System.out.println(names[i] + ": " + scores[i]);
        System.out.println("----------------");


        String[] classNames = new String[5]; //size 5 elements
        classNames[0]="ali";
        classNames[1]="veli";
        classNames[2]="ali1";
        classNames[3]="veli1";
        classNames[4]="ali11";
        for(int i=0;i<=classNames.length-1;++i)
        System.out.print(classNames[i]+ " ");


    }
}
