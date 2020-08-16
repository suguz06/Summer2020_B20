package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetOrder2 {
    public static void main(String[] args) {


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

//        for (Carpet2 each: carpetArray) {
//            if (each.isPersian){
//                persianCarpet.add(each);
//            } else regularCarpet.add(each);
//        }


        System.out.println("===================" );
        persianCarpet.addAll(Arrays.asList(carpetArray));
        regularCarpet.addAll(Arrays.asList(carpetArray));
        //persianCarpet.addAll(Arrays.asList(carpet1, carpet2, carpet3, carpet4, carpet5));
        //regularCarpet.addAll(Arrays.asList(carpet1, carpet2, carpet3, carpet4, carpet5));


        persianCarpet.removeIf(p -> !p.isPersian);
        //  OR    regularCarpet.removeIf(p -> p.isPersian);
        regularCarpet.removeAll(persianCarpet);

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
