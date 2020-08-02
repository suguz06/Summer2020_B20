package day10_if_if;

public class Multi_Branch_If {

    public static void main(String[] args) {

        int number =  0;
        String statusNumber = "";

        String result="";

//        if (number > 0)
//            statusNumber = number + " is positive";
//        else if (number < 0)
//            statusNumber = number + " is negative";
//        else
//            statusNumber = number + " is zero";
//
//        System.out.println(statusNumber);

        result= (number >0? "positive": (number <0 ? "negative":"zero"));

        System.out.println(result);

    }
}
