package day33_LocalDateTime;

public class Uniques {

    public static void main(String[] args) {

        int[] arr = {1, 3, 3, 3, 2, 2, 4,7,66,5,55,5};
uniques(arr);

double[] arr1 = {1.2, 3, 3, 3, 2, 2, 4.2,7,66,5,55,5};

uniques(arr1);
char[] q={'a','b','c','a'};
uniques(q);

String [] qq={"aa", "sw","aa","a"};
uniques(qq);

//        int element = arr[0];
//        int count = 0;
//        for (int b : arr) {
//            if (element == b) count++;
//        }
//        if (count == 1) System.out.println(element);
//
//        System.out.println("=========");
//
//        for (int element1 : arr) {
//
//            int count1 = 0;
//            for (int b : arr) {
//                if (element1 == b) count1++;
//            }
//            if (count1 == 1) System.out.println(element1);
//
//        }
    }

    //lets write a custom method also overloading method

    public static void uniques(int[] arr) {

        for (int element1 : arr) {

            int count1 = 0;
            for (int b : arr) {
                if (element1 == b) count1++;
            }
            if (count1 == 1) System.out.print(element1+ " ");

        }
        System.out.println();
    }

    public static void uniques(double[] arr) {

        for (double element1 : arr) {

            int count1 = 0;
            for (double b : arr) {
                if (element1 == b) count1++;
            }
            if (count1 == 1) System.out.print(element1+ " ");

        }
        System.out.println();
    }

    public static void uniques(char[] arr) {

        for (char element1 : arr) {

            int count1 = 0;
            for (char b : arr) {
                if (element1 == b) count1++;
            }
            if (count1 == 1) System.out.print(element1+ " ");

        }
        System.out.println();
    }

    public static void uniques(String[] arr) {

        for (String element1 : arr) {

            int count1 = 0;
            for (String b : arr) {
                if (element1.equals(b)) count1++;
            }
            if (count1 == 1) System.out.print(element1+ " ");

        }
        System.out.println();
    }



}
