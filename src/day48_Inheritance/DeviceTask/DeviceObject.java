package day48_Inheritance.DeviceTask;

public class DeviceObject {

    public static void main(String[] args) {
        TV tv1=new TV("LG", "xc", 250.20, false, false, "120", true);

        Phone phone1=new Phone("Apple", "XL",850,true, true, "12", "Mac OS");

        Laptop laptop=new Laptop("Dell", "Inspirattion", 800, true, true, "12","Windows");


        System.out.println(laptop);
        System.out.println(phone1);
        System.out.println(tv1);
    }
}
