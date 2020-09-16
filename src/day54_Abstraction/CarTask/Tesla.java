package day54_Abstraction.CarTask;

public class Tesla extends Car{ // if we class absratct=> we can not create any object

    @Override
    public void start() { // override the method=> compile error quickly gone
        System.out.println("Starting Tesla by Voice control"); // we cannot give override method abstarct=> otherwise body must empty
    } // if method abstract=> we can not give any implementation
}
