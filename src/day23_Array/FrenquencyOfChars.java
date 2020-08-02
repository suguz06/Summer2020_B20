package day23_Array;

//interview question
public class FrenquencyOfChars {


    public static void main(String[] args) {

        String str = "ABAB"; //A2B2 how can I get AB=> remove the duplicate
        String nonDup = ""; //AB
        String result = ""; //A2B2

        //find nonduplicate
        for (int i = 0; i <= str.length() - 1; ++i) {
            String c = str.charAt(i) + ""; //A,B,A,B
            if (!nonDup.contains(c)) {
                nonDup += c;

            }
        }
        System.out.println(nonDup);

        for (int j = 0; j <= nonDup.length() - 1; j++) {
            char ch = nonDup.charAt(j);
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }


            }
            result += "" + ch + count;

//        for(int j=0; j <= nonDup.length()-1; j++ ){
//
//            char ch = nonDup.charAt(j);
//            int count = 0;
//            for(int i = 0; i <= str.length()-1; i++){
//                if(str.charAt(i) == ch){
//                    count+=1;
//                }
//            }
//
//            result += ""+ch + count;


        }
        System.out.println(result);
    }
}
