package day19_For_Loop;

/*

 */
public class WarmUps {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i += 2) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " ");
            }
        }

        for (int i = 0; i < 100; i += 2) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " ");
            }
        }
        int sum = 0;
        for (int i = 2; i <= 100; i += 2) {

            sum += i;
        }
        System.out.println(sum);
        int sum1 = 0;
        for (int i = 1; i <= 100; i += 2) {

            sum1 += i;
        }
        System.out.println(sum1);
//        String result="";
//        for(char ch='a'; ch< 'z'; ch++) {
//
//            System.out.print(ch + " ");
//        }



    }


}

