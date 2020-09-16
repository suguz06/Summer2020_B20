package Office_Hours.Practice_09_09_2020;
//advantage of Inheritance
//re-usable, less memory, less codong, easy to maintain


public class PhoneShop { //phoneShop HAS A iphone => no inheritance

    public static void main(String[] args) {

        Iphone iphone = new Iphone("11 Pro", 1000);

        System.out.println(iphone);
        iphone.call(911);
        iphone.text(911);

        System.out.println("===============");

        Samsung samsung = new Samsung("Galaxy Note 20", 799.99);

        samsung.call(911);
        samsung.text(1231231);
        System.out.println(samsung);

        System.out.println("===========");

        Nokia nokia = new Nokia("8800 Saphire", 800);

        nokia.call(911);
        System.out.println(nokia);
        samsung.text(545454);


    }
}
