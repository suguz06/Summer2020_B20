package Office_Hours.Packages_07_13_2020;

import java.util.Scanner;

public class FrequencyOfStrings {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word");
        String str = scan.nextLine();


        //1.remove duplicates "JAVA" =>JVA
        String nonDup = "";


        for (int i = 0; i <= str.length() - 1; ++i) {
            if (!nonDup.contains(str.charAt(i) + "")) {
                nonDup += str.charAt(i) + "";
            }
        }
        System.out.println(nonDup);
        //2. frequency=> count the chars =>J1A2V1

        for (int i = 0; i <= nonDup.length() - 1; ++i){
            String c = nonDup.charAt(i) + "";
            int count = 0;
            for (int j = 0; j <= str.length() - 1; ++j) {
                String check = str.charAt(j) + "";
                if (check.equals(c)) {
                    count++;
                }

            }

            System.out.print( c+ ":"+ count+ " ,");
        }





    }
}
