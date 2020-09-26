package day58_Polymorphism;


import day57_Polymorhism.AbstractionTask1.Iphone;
import day57_Polymorhism.AbstractionTask1.Phone;
import day57_Polymorhism.AbstractionTask1.Samsung;

import java.util.ArrayList;
import java.util.Arrays;

public class PhoneShop {


    public static void main(String[] args) {

        Phone[] phone = {
                new Samsung("XX", 1000, 3.2),
                new Iphone("X", 1200, 2.3),
                new Samsung("XX", 1000, 3.2),
                new Iphone("X", 1200, 2.3),
                new Samsung("XX", 1000, 3.2),
                new Iphone("X", 1200, 2.3),
                new Samsung("XX", 1000, 3.2),
                new Iphone("X", 1200, 2.3),
                new Samsung("XX", 1000, 3.2),
                new Samsung("XX", 1000, 3.2),
                new Samsung("XX", 1000, 3.2),

        };

        ArrayList<Phone> phoneShop = new ArrayList<>(Arrays.asList(phone));

        int countIphone = 0;
        int countSamsung = 0;
        int countHiwaei = 0;

//        for (int i = 0; i <= phoneShop.size() - 1; i++) {
//            if (phoneShop.get(i) instanceof Iphone) {
//                countIphone++;
//            } else if (phoneShop.get(i) instanceof Samsung) {
//                countSamsung++;
//            } else {
//                countHiwaei++;
//            }
//
//        }


        for (Phone each: phoneShop){
            if (each instanceof Iphone) countIphone++;
            else  if(each instanceof Samsung) countSamsung++;
            else countHiwaei++;
        }

        System.out.println("Iphone "+ countIphone);
        System.out.println("Samsung "+ countSamsung);
        System.out.println("Huwai "+ countHiwaei);


    }
}
