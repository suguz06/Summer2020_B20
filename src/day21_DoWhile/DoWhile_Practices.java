package day21_DoWhile;


public class DoWhile_Practices {
    public static void main(String[] args) {

        int i = 1;
        // char t='a';
        do {
            System.out.print(i + " ");
            // System.out.print(  t+ " ");
            i++; //t++;
        }
        while (i <= 20);
        System.out.println();
        System.out.println(i); // in do staement i=21

        System.out.println("==============");

        char ch = 'Z';

        do {
            System.out.print(ch + " ");
            ch--;
        }
        while (ch >= 'A');


    }
}
