package day09_If_Else;

public class maximumThreeNumbers {

    public static void main(String[] args) {


        double a = 200;
        double b = 2000;
        double c = 3300;
        double max = 0;// we want to assign the max number to
       // variable max

        boolean aIsMAx = a >= b && a >= c;
        boolean bIsMax = !aIsMAx && b >= c;
        boolean cIsMax = !aIsMAx && !bIsMax; //!(aIsMAx &&  bIsMax)

        if (aIsMAx) {
            //System.out.println("a is max");
            max = a;
        }
        if (bIsMax) {
           // System.out.println("b is max");
            max=b;
        }
        if (cIsMax) {
           // System.out.println("c is max");
            max=c;
        }
        System.out.println(max);


// maximum number ==>>> very elegany way

       double result = (a>b)? (a>c? a: c): (b>c? b:c);

        System.out.println(result);
    }
}
