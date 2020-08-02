package day32_OverloadMethods;
/*

tasks1:
    1. create a method that can find the addition of two numbers
                        addition2Numbers
    2. create a method that can find the addition of three numbers
                        addition3Numbers
    3. create a method that can find the addition of four numbers
                        addition4Numbers
                        addition

 */
public class OverLoadingMethod {
    public static void main(String[] args) {
      double s=  sum(25, 36);
      double ss=sum(22, 445, 34);
        System.out.println(ss);
    }


    public static double sum(double a, double b) {

       double sum=a+b;
       return sum;
    }

    public static double sum(double a, double b, double c) {

        double sum=a+b+c;
        return sum;
    }

    public static double sum(double a, double b, double c, double d) {

        double sum=a+b+c+d;
        return sum;
    }


}
