package day24_Array;


/* IMPORTANT
this methods is used for all uninesss problem
string array collection list
 */
public class Uniqess2 {
    public static void main(String[] args) {


        String str = "aabcc";

        String expResult = "";
// freqency of every chars
        for (int k=0; k<=str.length()-1; ++k) {
            char ch1 = str.charAt(k);
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                char each = str.charAt(i);

                if (ch1 == each) {
                    count += 1;
                }

            }
            if(count==1) {expResult +=ch1;}

        }System.out.println(expResult);
    }
}