package InterviewQA;

import java.util.Arrays;

public class SameStringElements {

    public  static boolean same(String s1, String s2){

        String [] ar1= s1.split("");
        String [] ar2=s2.split("");

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        String a1="";
        for (String each: ar1){
            a1 +=each;
        }
        String a2="";
        for (String each: ar2){
            a2 +=each;
        }

        return a1.equals(a2);

    }


    public static void main(String[] args) {

        same("aebcd", "bcfad");
        System.out.println(same("aebcd", "bcfad"));

    }
}
