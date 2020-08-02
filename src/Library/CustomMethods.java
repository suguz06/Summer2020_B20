package Library;

public class CustomMethods {

    public static void removeDup(String str) {

        String nonDup = "";
        for (String each : str.split("")) {

            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }
        System.out.println(nonDup);


    }


    public static  void reverse(String str) {

        String reverse="";
        for(int i=str.length()-1; i>=0;--i) {

            reverse +=str.charAt(i);
        }
        System.out.println(reverse);
    }







}
