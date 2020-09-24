package day57_Polymorhism.AbstractionTask;
/*
create a class named Samsung that can inherit from AndroidApps and Phone
            actions: texting(), calling(), freezing()
             if the price of Samsung is more than 1200, the system should throw an exception with a message of:
                    Invalid Price, Samsung' price cannot more than 1200
 */
public class Samsung extends Phone implements AndroidAppStrore, Downloadable {

    public Samsung(  String model, double price, double size) {
        super("Samsung", model, price, size);
        if (price>1200) {
            throw new RuntimeException("Invalid Price, Samsung' price cannot more than 1200");
        }
    }

    @Override
    public void texting() {
        System.out.println("texting iphone");
    }

    @Override
    public void calling() {
        System.out.println("texting iphone");
    }


    @Override
    public void downloadAndroidApp() {
        System.out.println("texting iphone");
    }

    public void freezing(){
        System.out.println("freezing Samsung");
    }

    @Override
    public void download() {
        System.out.println("Sansung is downloading from "+  AppStoreName);
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size=" + size +
                '}';
    }
}
