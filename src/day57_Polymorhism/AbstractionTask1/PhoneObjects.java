package day57_Polymorhism.AbstractionTask1;

import java.util.Arrays;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iPhone=new Iphone("X", 1200, 10.2);

        System.out.println(iPhone);

        Samsung samsung=new Samsung("Galaxy",1050,12.2);


        System.out.println(samsung);


        samsung.download();

        Huawei huawei=new Huawei("AA", 120, 12.0);
        huawei.download();
        System.out.println("huawei = " + huawei);


   //Polymorphism=> object behaves many forms


        Phone phone1=new Iphone("x",120,2.6);
        Phone phone2=new Huawei("Robbery", 12, 2.3);
        Phone phone3=new Samsung("xl", 20, 2.8);

        //Parent class is a refference class of child class
   Phone [] phones={phone1,phone2,phone3,samsung,huawei,iPhone};
// we use parent class in array Phone(parent class)

        System.out.println(Arrays.toString(phones));
    }
}
