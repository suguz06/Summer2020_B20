package day19_For_Loop;

public class Alphabet_For_Loop {

    public static void main(String[] args) {

        String result1="";
        for(char ch1='z'; ch1>= 'a'; ch1--) {

            // System.out.print(   (ch1 + " ").toUpperCase());
            ///System.out.print(   (ch1 + " "));
            result1 +=ch1 +" ";
        }
        System.out.println(result1.toUpperCase());
        System.out.println(result1);
        String result2=result1;
        String reverse="";
        for (int i=result2.length()-1; i>=0;i--) {
            reverse +=result2.charAt(i)+" ";
        }
        System.out.println(reverse);
        System.out.println(reverse.toUpperCase());

        for (char t=97; t<=122; t++) {
            System.out.print(t+ " ");
        }
        System.out.println();
        for (char tt=65; tt<=90; tt++) {
            System.out.print(tt+ " ");
        }


    }
}
