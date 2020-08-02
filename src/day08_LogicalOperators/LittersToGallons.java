package day08_LogicalOperators;

/*
   1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785 gallons
 */



public class LittersToGallons {
    public static void main(String[] args) {

        double litters=10;
        double gallons= 1/3.785 * litters;

        System.out.println( litters+ " litters is "+ (int)gallons + " gallons");
        System.out.println("aaa" + false);
        System.out.println("aa" + 'b');
    }


}
