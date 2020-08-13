package day40_CustomClass2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyNewOffers {

    public static void main(String[] args) {

        Offers offer1 = new Offers();
        Offers offer2 = new Offers();
        Offers offer3 = new Offers();
        Offers offer4 = new Offers();
        Offers offer5 = new Offers();
        Offers offer6 = new Offers();
        Offers offer7 = new Offers();

        offer1.setOfferInfo(100000, "VA", true, true, true, "QA", false);
        offer2.setOfferInfo(140000, "NJ", true, true, true, "SDET", true);
        offer3.setOfferInfo(110_000, "NY", true, true, true, "QA", false);
        offer4.setOfferInfo(99_000, "TX", true, true, true, "BA", true);
        offer5.setOfferInfo(130000, "VA", true, true, true, "SDET", true);
        offer6.setOfferInfo(80_000, "CO", true, true, true, "Senior SDET", false);
        offer7.setOfferInfo(130_000, "DC", true, true, true, "QA", true);

        ArrayList<Offers> offerList = new ArrayList<>();
        offerList.addAll(Arrays.asList(offer1, offer2, offer3, offer4, offer5, offer6, offer7));


        for (Offers each : offerList) {
            each.getOfferInfo();
        }

        System.out.println("============+++++++++++++===========");
        //offerList.removeIf(p -> p.salary < 100_000);
        //offerList.removeIf(p-> p.jobTitle.equals("QA"));
//offerList.removeIf(p-> !p.hasBenefit);
        System.out.println("Number of Offer left: "+ offerList.size());

        System.out.println("================");

        String myLocation="VA";
        // less than 120K or not from local area
        offerList.removeIf(p-> p.salary<120_000
                || ! p.location.equals(myLocation)
        );

        for (Offers each : offerList) {
            each.getOfferInfo();
        }
        System.out.println("Number of Offer left: "+ offerList.size());


    }
}
