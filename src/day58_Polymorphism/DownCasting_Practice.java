package day58_Polymorphism;


import day57_Polymorhism.AbstractionTask1.Huawei;
import day57_Polymorhism.AbstractionTask1.Iphone;
import day57_Polymorhism.AbstractionTask1.Phone;
import day57_Polymorhism.AbstractionTask1.Samsung;

public class DownCasting_Practice {

    public static void main(String[] args) {


        Phone phone1 = new Iphone("11", 1200, 5.6);



        ((Iphone) phone1).faceTiming(); // group of all parenthesis to have action


        // phone1.faceTiming(); // reference type can not have this action

        Iphone iphone = (Iphone) phone1;

        iphone.faceTiming(); // polymorphism=> reference type is now Iphone
        //then call the action facetiming


        System.out.println(iphone);
        System.out.println(phone1);


        System.out.println("=====================");

        Phone phone2=new Samsung("ff", 1000, 5.4);


       // phone2.freezing(); // refreence type can not have this action
        //DownCasting to have this action

        //use one time => just group casting => otherwise assing variable to reuse again
        ((Samsung) phone2).freezing();

       // phone2.faceTiming(); // it is not action of Samsung => action of Iphone

       // ((Iphone)phone2).faceTiming();// ClassCastExeception Samsung not casting Iphone= >
        //there is no inheritance relation iphone IS A samsung


        System.out.println("=======================");



        Phone phone3=new Huawei("fake", 200, 4.9);

        //phone3.stealInfor(); // no direct call this method => reference type what can call or Call

        //grouping casting for one time use
        ((Huawei)phone3).stealingInfo();


      //  ((Iphone)phone3).faceTiming(); //no inheritance relation=> gives compile error
        // java.lang.ClassCastException:


    }

}
