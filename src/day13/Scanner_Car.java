package day13;


import java.util.Scanner;

/*
 write a program that asks the user enter his car info:
                            brand
                            model
                            year
                            color
                            mileage
                            price
                ex: output format should be:
                      2012 Toyota Corolla white, 120000 miles, 12000 dollars
​

 */
public class Scanner_Car {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
String sport="";


        boolean istall=in.nextBoolean();
        boolean isfast=in.nextBoolean();
        boolean isflexible=in.nextBoolean();

        if(istall) {
            if (isfast) {
                sport = "basket";
            } else if (isflexible)
                sport = "gym";
            else sport = "vol";
        } else {

            if(isfast) {
                sport="soc";
            }else  sport="tennis";
        }






        System.out.println(sport);


         }
    }



