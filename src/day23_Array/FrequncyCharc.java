package day23_Array;

/*

write a prgram that can return the frequency of every single characters from the string:
            ex:
                str1 = "aabbccaa";
                output: a4b2c2
                HINT:
                    easier approach:
                            1. remove duplicates ==> str2 = "abc"
                            2. then find each of str2' character' frequency in str1 ==> 4, 2, 2
                            3. result: a4b2c2
                        previous section we leaned how to find the frequency of one character. you will need to repeat the same steps
 */
public class FrequncyCharc {

    public static void main(String[] args) {


        String str1 = "aabbccaa";
        String result = "";
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;
        for (int i = 0; i <= str1.length() - 1; ++i) {
            if (!result.contains("" + str1.charAt(i))) {
                result += str1.charAt(i);
            }
        }
        System.out.println(result);
        String ch = result.charAt(0) + "";
        String ch1 = result.charAt(1) + "";
        String ch2 = result.charAt(2) + "";
        for (int k = 0; k <= str1.length() - 1; ++k) {
            if ((str1.charAt(k) + "").equals(ch)) {
                counter++;
            } }
            for (int k = 0; k <= str1.length() - 1; ++k) {
                if ((str1.charAt(k) + "").equals(ch1)) {
                    counter1++;
                } }
                for (int k = 0; k <= str1.length() - 1; ++k) {
                    if ((str1.charAt(k) + "").equals(ch2)) {
                        counter2++;
                    }


                }
                System.out.println(ch + counter + ch1 + counter1 + ch2 + counter2);
                //System.out.println(result);

            }
        }


