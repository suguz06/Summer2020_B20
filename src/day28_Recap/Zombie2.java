package day28_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie2 {




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        int[] rev1 = new int[8]; //or int[] rev1 = {0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("Day " + 0 + " " + Arrays.toString(inhabitants));
        int length=inhabitants.length;

        int i = 1;
        while (true) {
            for (int k = 0; k <= length-1; ++k) {

                if (k < length-1) {  //compare two elements respectively !!
                    if (inhabitants[k] != 0 && inhabitants[k + 1] == 0) { // k<length-1 since k+1 should be index
                        inhabitants[k] = inhabitants[k] / 2;
                    }

                    if (inhabitants[k] == 0 && inhabitants[k + 1] != 0) { // k<length-1 since k+1 should be index
                        inhabitants[k + 1] = inhabitants[k + 1] / 2;
                        k += 1; // to jump  another two non-compared elements !!
                    }
                }
            }
            System.out.println("Day " + i + " " + Arrays.toString(inhabitants));
            if (Arrays.equals(inhabitants, rev1)) break;
            ++i;
        }
        System.out.println("---- EXTINCT ----");
    }
}
