package day41_toString;

import java.util.ArrayList;

public class CarpetOrder {


    public static void main(String[] args) {

        Carpet2 carpet1 = new Carpet2();
        Carpet2 carpet2 = new Carpet2();
        Carpet2 carpet3 = new Carpet2();
        Carpet2 carpet4 = new Carpet2();
        Carpet2 carpet5 = new Carpet2();
//

        carpet1.customOrder(100, 120, 20, true);
        carpet2.customOrder(80, 100, 30, false);
        carpet3.customOrder(60, 100, 20, true);
        carpet4.customOrder(120, 120, 10, false);
        carpet5.customOrder(90, 130, 15, true);

         Carpet2 [] carpetArray= {new Carpet2(),new Carpet2(), new Carpet2(),
         new Carpet2(), new Carpet2()};

         carpetArray[0].customOrder(4.5, 3.5, 7.5, false);
        carpetArray[1].customOrder(2.5, 5.5, 8.5, true);
        carpetArray[2].customOrder(3.5, 3.5, 5.5, true);
        carpetArray[3].customOrder(4.5, 3.5, 6.5, false);
        carpetArray[4].customOrder(2.5, 4.5, 3.5, true);


         for (Carpet2 each: carpetArray) {
             each.getCarpetInfo();
         }


        ArrayList<Carpet2> persianCarpet = new ArrayList<>();
        ArrayList<Carpet2> regularCarpet = new ArrayList<>();

        for (Carpet2 each: carpetArray) {
            if (each.isPersian){
                persianCarpet.add(each);
            } else regularCarpet.add(each);
        }


        System.out.println("===================" );
//        persianCarpet.addAll(Arrays.asList(carpetArray));
//        regularCarpet.addAll(Arrays.asList(carpetArray));
//        persianCarpet.addAll(Arrays.asList(carpet1, carpet2, carpet3, carpet4, carpet5));
//        regularCarpet.addAll(Arrays.asList(carpet1, carpet2, carpet3, carpet4, carpet5));
//
//
//        persianCarpet.removeIf(p -> !p.isPersian);
//        regularCarpet.removeIf(p -> p.isPersian);

        for (Carpet2 each : persianCarpet) {
            each.getCarpetInfo();
        }

        for (Carpet2 each : regularCarpet) {
            each.getCarpetInfo();
        }

        System.out.println("Number of persian carpet: "+ persianCarpet.size());
        System.out.println("Number of regular carpet: "+ regularCarpet.size());
    }
}
