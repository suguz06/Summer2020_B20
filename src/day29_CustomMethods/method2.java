package day29_CustomMethods;

public class method2 {


    public static void main(String[] args) {


        evenNumber(100);
        System.out.println();
        oddNumber(100);
        System.out.println();
        even1(100);
        System.out.println();
        method2.even1(20); //call the method from the class

    }




    public static void evenNumber(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        } }

    public static void oddNumber(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        } }

    public static void even1(int n) {
        for (int i = 2; i <= n; i +=2) {
              System.out.print(i + " ");
        } }



}