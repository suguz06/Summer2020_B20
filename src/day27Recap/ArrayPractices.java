package day27Recap;

import javax.crypto.spec.PSource;
import java.util.Arrays;

/*
1d ==store collections of variables
multiD== store multiD arrays
 */
public class ArrayPractices {

    public static void main(String[] args) {

        String[] classMate = {"Ali", "Veli", "Deli"};

        int a = classMate.length;
        System.out.println("--------------");

        for (int i = 0; i < a; ++i) {
            System.out.println(classMate[i]);

        }
        System.out.println("--------------");

        for (String ir : classMate) {
            System.out.println(ir);

        }

        System.out.println("--------------");
        int x=0;
        while (x<a) {
            System.out.println(classMate[x]);
            x++;

        }

        System.out.println("-----------");

        int s=0;
        do {
            System.out.println(classMate[s]);
            s++;
        }

                while (s<a);

        System.out.println(Arrays.toString(classMate));


    }

}
