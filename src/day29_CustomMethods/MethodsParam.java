package day29_CustomMethods;

public class MethodsParam {

    public static void eligibleAlcohol(int age, boolean hasId) {

        if (age > 17 && hasId) System.out.println("here you go");
        else System.out.println("Drink milk");


    }


    public static void grade(int grade) {
        if (grade > 100 || grade < 0) System.out.println("invalid grade");
        if (grade>=90&&grade <= 100) System.out.println("A");
        else if (grade >= 80 && grade < 90) System.out.println("B");
        else if (grade >= 70 && grade < 80) System.out.println("C");
        else if (grade >= 60 && grade < 70) System.out.println("D");
        else if (grade < 60) System.out.println("F");
}



public static void grade1(int score) {

       if(score<0 ||score>100) {
           System.out.println("invalid score");
           return;
       }

           char grade= (score>=90)? 'A':
                (score>=80)? 'B': score>=70?'C': score>=60?'D':'F';
    System.out.println("grade is "+ grade);

}
    public static void main(String[] args) {
        eligibleAlcohol(18, true);
        grade(70);
        reverseString("Hello world");
        grade1(-10);
    }


    public static void reverseString(String givenString) {
        String reverse="";
        for(int i=givenString.length()-1; i>=0;--i) {
             reverse   +=""+givenString.charAt(i);
        }
        System.out.println("Reverse of " + givenString+ " is " +reverse);
    }


}
