package Office_Hours.Practice_06_17_2020;

public class Number_Days_Month {

    public static void main(String[] args) {


        int num = 5;

        String result = "";
        String result1 = "";

        boolean days28 = num == 2;
        boolean days30 = num == 4 || num == 6 || num == 9 || num == 11;
        boolean days31 = num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12;


        if (days28) result = "28 days";
        else if (days30) result = "30 days";
        else if (days31) result = "31 days";
        else result = "invalid";

        System.out.println(result);

        result1 = days28 ? "28 days" : days30 ? "30 Days" : days31 ? "31 days" : "invalid";

        System.out.println(result1);




    }
}
