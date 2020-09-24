package day56_Abstraction.PhoneTask;

public final class Samsung extends  Phone { //by declararing final=> no have a subclass=> this class can not be super class


    public Samsung(String model, double price, String size) {
        super("Samsung", model, price, size);
        if(price<=0 || price>1200) {
            throw new RuntimeException("Invalid Price"+ price);
        }
    }


    @Override
    public void calling(long number) {
        System.out.println("Samsung is calling "+ number);
    }

    @Override
    public void calling(long number1, long number2) {
        calling(number1);
        calling(number2);
    }

    @Override
    public void texting(long number) {
        System.out.println("Samsung is texting "+ number);
    }

    @Override
    public void texting(long number1, long number2) {
        texting(number1);
        texting(number2);
    }

    public void freezing(){
        System.out.println("Samsung is freezing  ");
    }



    @Override
    public String toString() {
        return "Iphone" + super.toString();
    }
//    @Override
//    public String toString() {
//        return "Samsung{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", price= $" + price +
//                ", size='" + size + '\'' +
//                '}';
//    }
}
