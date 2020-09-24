package day56_Abstraction.PhoneTask;

public abstract class Phone {

/*
 1. create an abstract class called Phone
            attributes: brand, model, price, size
            abstract methods: calling(), texting();
            instance method: toString()
            add a constructor that can initialize all the instances
 */


    public String brand;
    public String model;
    public double price;
    public String size;

    public Phone(String brand, String model, double price, String size) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.size = size;
    }


    public abstract void calling(long number);
    public abstract void calling(long number1, long number2);

    public abstract void texting(long number);

    public abstract void texting(long number1, long number2); // overloading method=>every method overloaded


    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
