package Office_Hours.Practice_06_17_2020;

public class Week_Days {

    public static void main(String[] args) {

        int day=8;
        String result="";
        String result1="";

        result=(day==1)? "Monday": (day==2 ? "Tuesday": (day==3? "Wednesday": (day==4? "Thursday": (day==5? "Friday": (day==6? "Saturday": (day==7? "Sunday": "invalid"))))));

        System.out.println(result);


        result1= day==1 ? "Monday":  day==2 ? "Tuesday":  day==3? "Wednesday":  day==4? "Thursday":  day==5? "Friday":  day==6? "Saturday":  day==7? "Sunday": "invalid";
        System.out.println(result1);
    }
}
