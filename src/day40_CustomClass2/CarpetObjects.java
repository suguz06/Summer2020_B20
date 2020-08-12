package day40_CustomClass2;

import day39_CustomClass.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects {

    public static void main(String[] args) {


Carpet [] carpetArray={new Carpet(), new Carpet(), new Carpet(), new Carpet(), new Carpet()};

     carpetArray[0].setCarpetInfo(115, 250, 150, false);
        carpetArray[1].setCarpetInfo(95, 150, 140, true);
        carpetArray[2].setCarpetInfo(115, 250, 180, true);
        carpetArray[3].setCarpetInfo(135, 450, 160, false);
        carpetArray[4].setCarpetInfo(165, 350, 130, false);

for (Carpet each: carpetArray) {
    each.getInfo();
}

        System.out.println("cost calculation");


        System.out.println(carpetArray[0].calCost(false));
        System.out.println(carpetArray[0].calCost(true));
        System.out.println("=====================");

        ArrayList<Carpet> persianCarpets=new ArrayList<>();
        ArrayList<Carpet> regularCarpets=new ArrayList<>();
        System.out.println("Persian ====================================");
persianCarpets.addAll(Arrays.asList(carpetArray));
persianCarpets.removeIf(p-> p.isPersian==false);

for (Carpet each: persianCarpets) {
    each.getInfo();
}

        System.out.println("Not Persian=> regular==================");

        regularCarpets.addAll(Arrays.asList(carpetArray));
        regularCarpets.removeIf(p-> p.isPersian==true);

        for (Carpet each: regularCarpets) {
            each.getInfo();
        }



    }
}
