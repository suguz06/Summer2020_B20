package day40_CustomClass2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {


        Offer o1 = new Offer();
        Offer o2 = new Offer();
        Offer o3 = new Offer();
        Offer o4 = new Offer();
        Offer o5 = new Offer();
        Offer o6 = new Offer();
        Offer o7 = new Offer();

        o1.setInfo("TX", false, 120000, true, "QA");
        o2.setInfo("NY", false, 125000, true, "QA");
        o3.setInfo("NJ", true, 100000, false, "DEV");
        o4.setInfo("VA", false, 130000, true, "QA");
        o5.setInfo("CA", true, 150000, true, "QA");
        o6.setInfo("IL", false, 120000, true, "BA");
        o7.setInfo("TX", true, 110000, false, "SDET");


        ArrayList<Offer> offerList = new ArrayList<>(Arrays.asList(o1, o2, o3, o4, o5, o6, o7));

        for (Offer each : offerList) {
            each.getInfo();
        }

        System.out.println("=================");
//        offerList.removeIf(p -> !p.location.equals("TX"));
//
//        for (Offer each : offerList) {
//            each.getInfo();
//        }
        System.out.println("=================");

       // offerList.removeIf(p -> !p.jobTitle.equals("QA") && !p.jobTitle.equals("SDET"));

//offerList.removeIf(p-> p.wfh==false);

        offerList.removeIf(p-> p.hasBenefit==false);
        for (Offer each : offerList) {
            each.getInfo();
        }
        System.out.println("=================");
    }
}