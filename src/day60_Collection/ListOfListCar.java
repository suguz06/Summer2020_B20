package day60_Collection;

import day54_Abstraction.CarTask.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfListCar {


    public static void main(String[] args) {

        List<Car> SUVs= new ArrayList<>();
        List<Car> sedans=new ArrayList<>();
        List<Car>truck=new ArrayList<>();
        List<Car>convertible=new ArrayList<>();


/*
iterate ever single car and print out the
brand: model: price
 */
        List<List<Car>> cars=new ArrayList<>();
        cars.addAll(Arrays.asList(SUVs,sedans,truck,convertible));

    }

}
