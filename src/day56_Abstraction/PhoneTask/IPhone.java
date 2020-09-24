package day56_Abstraction.PhoneTask;



public final class IPhone extends Phone { //final class can be subclass=> but not a super class


    public IPhone( String model, double price, String size) {
        super("IPhone", model, price, size);
        if(price<=0|| price>1500) {
            throw new RuntimeException("Invalid Price"+price);
        }
    }

    @Override
    public void calling(long number) {
        System.out.println(brand+ " is calling "+ number);

    }

    @Override
    public void calling(long number1, long number2) {
        calling(number1);
        calling(number2);
    }

    @Override
    public void texting(long number ) {
        System.out.println(brand+" is texting "+ number);
    }

    @Override
    public void texting(long number1, long number2) {
        texting(number1);
        texting(number2);
    }

    public void faceTiming(long number){// only unique for iphone => no inside super class
        System.out.println("Iphone is facetiming with "+number);
    }

    public void faceTiming(long number1, long number2){ //overloaded
        faceTiming(number1);
        faceTiming(number2);
    }


    @Override
    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
