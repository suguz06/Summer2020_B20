package day57_Polymorhism.AbstractionTask1;

public class Iphone extends Phone implements AppleAppStore {


    public Iphone(String model, double price, double size) {
        super("IPhone", model, price, size);
        if (price>1500) {
            throw new RuntimeException("Invalid Price, Iphone' price cannot more than 1500");
        }
    }


    @Override
    public void texting() {
        System.out.println("texting iphone");
    }

    @Override
    public void calling( ) {
        System.out.println("calling iphone");
    }

    public void faceTiming(){
        System.out.println("facetiming iphone");
    }

    @Override
    public void downloadAppleApp() {

    }

    @Override
    public void download() {
        System.out.println("iphone is downloadin app from"+ AppStoreName);
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size=" + size +
                '}';
    }
}
