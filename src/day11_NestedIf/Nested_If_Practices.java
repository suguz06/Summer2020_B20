package day11_NestedIf;

public class Nested_If_Practices {

    public static void main(String[] args) {
        int score = 55;
        String result = "";

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                result = "A";
            } else if (score >= 80  ) {
                result = "B";
            }  else if (score >= 70  ) {
                result = "C";
            }
            else if (score >= 60  ) {
                result = "D";
            }else  {result="F";}

        } else {
            System.out.println("invalid score");
        }

        System.out.println(result);



         //Ternary


        String result2= (score<0 || score>100)? "invalid score":
                (score>=90)? "A":
                (score<90 && score>=80)? "B": (score<80 && score>=70)?
                        "C": (score<70 && score>=60)?
                        "D":  "F";

        System.out.println(result2);
    }
}
