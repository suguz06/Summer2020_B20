package day34_WrapperClass;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class WrapperClass_Practice {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        Integer[] ar = {1, 2, 3, 4};

        for (Integer a : ar) { // no auto no un boxing
            System.out.println(a);
        }

        for (int a : ar) { //   un boxing
            System.out.print(a);
        }

        double[] a = {1, 2, 3, 4};
        Double[] aar = {1.0, 2.3, 3.4, 4.9};
// Double w=4; gives error=>loyal own decimal
        System.out.println("==========");
        for (double i : aar) {
            System.out.println(i);
        }

        char[] c2 = {65, 66, 67};

        System.out.println(Arrays.toString(c2));
        char cc = 70;
        Character ccc = cc;

        System.out.println(ccc);

        System.out.println(Integer.MIN_VALUE);

        String[] at={"12", "13","14", "15"};
        double[] r=new double[at.length];

        for (int i=0; i<at.length; ++i) {

            r[i]=Double.parseDouble(at[i]);
        }
        System.out.println(Arrays.toString(r));
    }
}
