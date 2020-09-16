package Office_Hours.Practice_09_09_2020;

public class Iphone extends Phone {

    /* inheritance
    methods+> 3
    variables=> 4 => static 2 (brand, madeIn) instance 2=> (model, price)

     */
    public Iphone(String model, double price) {
        super(model, price); // setInfo method=> set the model and price
// static variables can be given here => but not best way here
//    brand="Iphone";
//    madeIn="China";  you can initialize by every time complier => use static block one times

    }

    static {
        brand = "iPhone";
        madeIn = "USA";
    }

    // overriding method condotoins
    //1- Access Modf => same or more visible => super class public method => subclass must be public to override

    @Override //for checking it works overriding
    public void call(long phoneNumber) {
        System.out.println("iPhone " + model + " is calling " + phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {

        System.out.println("iPhone " + model + " is texting " + phoneNumber);
    }








}
