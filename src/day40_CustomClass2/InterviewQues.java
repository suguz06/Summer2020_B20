package day40_CustomClass2;


/*
Given a String with numbers and letters. Output the sum of all numbers
in given String. For example: Input: String str = “jav34ajs4jk6”; Output: 44 (34 + 4 + 6 = 44)
 */
public class InterviewQues {

    public static void main(String[] args) {
        System.out.println(sumsOfCharInts("a11b2c3"));
        //System.out.println(sunNum("a11b2c3"));
    }

    public static int sumsOfCharInts(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(c+"");

            }

        } return sum;
    }

        public static int sunNum(String a){

            String temp = "";
            int sum1 = 0;
            for (char c : a.toCharArray()) {
                if (Character.isDigit(c)) {
                    temp += c+"";
                } else {
                    sum1 += Integer.parseInt(temp);
                    temp = "";
                }
            }
            return sum1 + Integer.parseInt(temp);
        }

//    static int findSum(String str)
//    {
//        // A temporary string
//        String temp = "";
//
//        // holds sum of all numbers present in the string
//        int sum = 0;
//
//        // read each character in input string
//        for(int i = 0; i < str.length(); i++)
//        {
//            char ch = str.charAt(i);
//
//            // if current character is a digit
//            if (Character.isDigit(ch))
//                temp += ch;
//
//                // if current character is an alphabet
//            else
//            {
//                // increment sum by number found earlier
//                // (if any)
//                sum += Integer.parseInt(temp);
//
//                // reset temporary string to empty
//                temp = "";
//            }
//        }
//
//        // atoi(temp.c_str()) takes care of trailing
//        // numbers
//        return sum + Integer.parseInt(temp);
//    }

}








