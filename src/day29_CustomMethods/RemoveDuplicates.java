package day29_CustomMethods;

public class RemoveDuplicates {

    // removes duplicates

    public static void removeDup(String str) {

        String nonDup = "";
        for (String each : str.split("")) {

            if (!nonDup.contains(each)) {
                nonDup += each;
            }
        }
        System.out.println(nonDup);


    }

    public static void main(String[] args) {
        removeDup("alladddddddffffffghhh555  444yyyy4");
    }

}
