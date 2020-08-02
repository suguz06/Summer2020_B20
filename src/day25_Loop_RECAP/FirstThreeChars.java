package day25_Loop_RECAP;

import java.util.Scanner;

public class FirstThreeChars {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an String array 5 ");
       // String[] arr = {"abbs", "bdhbdb", "ndbdkjbkj", "mklj"};
        String[] arr =new String[5];
        for(int i=0; i<=4;++i)
        {arr[i]=scan.next(); }

        String result="";
        String result1="";
//method usual for loop
for(int i=0; i<= arr.length-1; ++i) {
    result+= " " +arr[i].substring(0, 3);
}
        System.out.println(result);

        System.out.println("=====");

 //method2 for each
               for(String each: arr) {
    result1 +=" " +each.substring(0, 3);

}
        System.out.println(result1);

    }
}



