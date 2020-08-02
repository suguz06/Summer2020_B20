package day09_If_Else;

public class MediumNumber {
    public static void main(String[] args) {


        double a=100;
        double b=20;
        double c=300;
        double med=0;

        boolean aIsMed= (a>b && a <c)|| (a<b&& a>c);
      //  boolean bIsMed= (b>a && b <c)|| (b<a&& b>c);
        boolean bIsMed= !aIsMed && (b<c || b>c);
        boolean cIsMed= !aIsMed && ! bIsMed;

        if (aIsMed) { med=a;}
        if (bIsMed) { med=b;}
        if (cIsMed) { med=c;}

        System.out.println(med);



    }



}
