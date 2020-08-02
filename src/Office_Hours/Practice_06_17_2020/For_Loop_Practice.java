package Office_Hours.Practice_06_17_2020;

public class For_Loop_Practice {

    /*
      print all the numbers between 0 ~ 100 that can be divisible by 3 or 5

     */
    public static void main(String[] args) {


        for (int i = 1; i < 100; i++) {

            if (i % 3 == 0 || i % 5 == 0) {

                System.out.print(i + " ");
            }
        }

//        int a = 1;
//        while (a <= 100) {
//            if (a % 3 == 0 || a % 5 == 0) {
//                System.out.print(a + " ");
//            }
//            a++;
//        }


        for (int l = 1; l <= 5; l++) {

            for (int k = 0; k <= 2; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for(int i= 1; i <8; i++){

            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }

        for(int i= 8; i > 0; i--){

            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();

        }





    }
}


