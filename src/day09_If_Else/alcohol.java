package day09_If_Else;

public class alcohol {

    public static void main(String[] args) {

        boolean hasID = true;
        int age = 39;

        boolean eligible = hasID && age >= 21;
        String result = "";

        if (eligible) {

            // System.out.println("eligible for alcohol");
            result = "eligible";
        } else {
            //System.out.println("not eligible");
            result = "not good";
        }

        System.out.println(result);
    }

}
