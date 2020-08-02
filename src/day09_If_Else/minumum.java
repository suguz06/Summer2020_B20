package day09_If_Else;

public class minumum {
    public static void main(String[] args) {
        double a=102;
        double b=20;
        double c=30;

        boolean aIsMin= a<b && a<c;
        boolean bisMin= !aIsMin && b<c;
        boolean cIsMin= ! (aIsMin || bisMin);// !aisMin && ! bIsMin
        double min=0;

        if (aIsMin) {  min=a;}
        if (bisMin) {  min=b;}
        if (cIsMin) {  min=c;}
        System.out.println("minimum number is  " +min);


    }






}
