package day12_Switch_Scanner;

public class Switch_Practices {
    public static void main(String[] args) {

        String result="";
        String prodcutName="iphone";

        switch (prodcutName) {


            case "Galaxy":
                result="Samsung";
                break;
            case "iphone":
            case "macbook":
            case "ipad":
                result="Apple";




        }
        System.out.println(result);

    }



}
