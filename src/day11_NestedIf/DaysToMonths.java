package day11_NestedIf;

public class DaysToMonths {

    public static void main(String[] args) {


        int months=1;
        boolean isCorrectNumber= months<0 && months>12;
       String  result= months==2? "28 days": (months==4||months==6||months==9||months==11)? "30 days": isCorrectNumber ? "enter a correct month": "31 days";


        System.out.println(result);

    }


}
