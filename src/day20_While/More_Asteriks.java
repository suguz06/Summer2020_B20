package day20_While;

public class More_Asteriks {

    public static void main(String[] args) {

        /*
         ******
         ******
         ******
         ******
         ******
         ******
         ******
         */

        for (int i=1; i<=7; i++) {
            int k=6;
            while (k>=i) {
                System.out.print("*");
                k--;
            }
            System.out.println();
        }


    }
}
