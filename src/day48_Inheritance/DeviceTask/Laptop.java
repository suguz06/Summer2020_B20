package day48_Inheritance.DeviceTask;

public class Laptop extends Device {
/*
 4. create a sub class of Device called Laptop:
                    attributes: brand, model, price, MadeIn,
                    hasBattery, hasMemory, screenSize, hasCPU, hasMouse, hasKeyBoard, OS
                    methods: coding, watching, setInfo, toString
                    add a constructor that can set the fileds

 */

    /*
inherited:
   variables:  brand, model, price, MadeIn, hasBattery,
   hasMemory, screenSize
   methods: setInfo, toString
 */
/*
not inherited:
    variables: hasCPU, hasMouse, hasKeyBoard, OS
    method: coding, watching
 */


    public static boolean hasCPU;
    public static boolean hasMouse;
    public static boolean hasKeyBoard;

    static {
        hasCPU = true;
        hasKeyBoard = true;
        hasMouse = true;
    }

    public String OS;


    public Laptop(String brand, String model, double price, boolean hasBattery, boolean hasMemory, String screenSize, String OS) {
        setInfo(brand, model, price, hasBattery, hasMemory, screenSize);
        this.OS = OS;

    }

    public void coding(){
        System.out.println("Coding"+ brand+" "+model);
    }

    public void watch(){
        System.out.println("Watching"+ brand+ " "+model);
    }


}
