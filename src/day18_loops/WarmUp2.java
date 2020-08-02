package day18_loops;
/*
  2.  print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
    3. print the following shape:
                    * * * * * *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    * * * * * *
            Hint: in the loop body , only place the statements that you need to repeat
 */


public class WarmUp2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 8; ++i) {
            System.out.println("******");


        }

        System.out.println("===============================");
        for (int i = 1; i <= 10; ++i) {


            if (i == 1 || i == 10) System.out.println("******");
            else {
                System.out.println("*    *");
            }


        }

//        for (int i = 1; i <= 10; ++i) {
//            for (int j = 1; j < i + 1; ++j) {
//
//                System.out.println("********");
//            }
//        }

        for (int j = 1; j <=5; j++) {

            for (int i = 1; i <=j; i++) {  // 1,2,3,4,5
                System.out.print( "*");
            }

            System.out.println();

        }
    }
}