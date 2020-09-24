package day57_Polymorhism.AbstractionTask;

public class Huawei extends  Phone implements AppleAppStore, AndroidAppStrore, Downloadable {


    public Huawei(  String model, double price, double size) {
        super("Huawei", model, price, size);
        if(price>200){
            throw new RuntimeException("No way Huawei is not worth than 200");
        }
    }

    @Override
    public void downloadAndroidApp() {

    }

    @Override
    public void downloadAppleApp() {

    }

    @Override
    public void download() {
        System.out.println("Huwaei is downloading apps from"+ AppleAppStore.AppStoreName+ " and "+ AndroidAppStrore.AppStoreName);
    }

    @Override
    public void texting() {

    }

    @Override
    public void calling() {

    }

    public void  stealingInfo(){
        System.out.println("Huawei is stealing info from any where!!");
    }

    @Override
    public String toString() {
        return "Huawei{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size=" + size +
                '}';
    }
}
