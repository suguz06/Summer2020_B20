package Office_Hours.Practice_09_16_2020;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {


    public static void main(String[] args) throws RuntimeException, InterruptedException, FileNotFoundException {


        //System.out.println(9/0); //unckcked exceptions //During runtime not compiler time

        Thread.sleep(3000);//checked exception during compile time
        System.out.println("Completed");



       // new FileInputStream("s"); // new manually added exception added method signature
    }
}
