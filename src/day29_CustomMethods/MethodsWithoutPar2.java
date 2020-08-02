package day29_CustomMethods;

public class MethodsWithoutPar2 {

    /*
    Step1: print hello 5 times
    Step2: print your school name
    Step 3 print hello 5 times
    Step 4 print your name
    Step5 print hello 5 times
     */
    public static void main(String[] args) {


        printHello5X();
        System.out.println("cybertek");
        printHello5X();
        System.out.println("cybertek");
        printHello5X();
        System.out.println();
        method2.even1(30); //call the method from the class

    }







    /*
    Accses-modifier  Specifier  return-type name() {
    statement
    }
     */

    public static void printHello5X() {
        for (int i = 10; i >= 6; i--) {
            System.out.println("Hello ");
        } }

    public static void oddNumber(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) System.out.print(i + " ");
        } }


}
