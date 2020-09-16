package Office_Hours.Practice_09_09_2020;

public class Samsung extends Phone {

    /* inheritance as it is from super class
    variables: 4 => 2 static 2 instance
    methods=> 3 call(),  text(), toString()



     */
    public Samsung(String model, double price) {
        super(model, price);
        //static is given here=> but every time compiler works=> just static block is ok
//        brand="Samsung";
//        madeIn="Korea";  // not reasonable here
    }

    static {
        brand = "Samsung";
        madeIn = "Korea";
    }

    @Override
    public void call(long phoneNumber) {
       // super.call(phoneNumber); we want to give different implementations
        System.out.println("Samsung "+ model+ " is calling "+ phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
       // super.text(phoneNumber);
        System.out.println("Samsung "+ model+ " is texting "+ phoneNumber);

    }

    //no need to override toString => since no need to add any implementtaions
}
