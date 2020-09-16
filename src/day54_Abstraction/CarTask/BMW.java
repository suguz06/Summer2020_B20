package day54_Abstraction.CarTask;

public class BMW  extends Car{ // complie error=> qickly abstract method override
//if absract class=> we can not create an object => BMW is not abstract


    @Override
    public void start() { // overrdie AcsMOd=> public (no more visible)
        System.out.println("Starting BMW by push start button"); // if use abstract=> we can not give any body or implementation
    } // return type, name, and params all must same



}
