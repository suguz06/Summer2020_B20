package day62_Maps;

public class Test {


    public static void main(String[] args) {

        //String favoriteColor="Blue";

        Color favoriteColor = Color.Blue;

        System.out.println(favoriteColor);


      //  String browserName = ""; //assign anything
        //create eNum for any limited browser

        Browser browserName = Browser.chrome;

        switch (browserName) {
            case chrome:
                System.out.println("Chrome browser is set");
                break;

            case firefox:
                System.out.println("Firefox browser is set");

            case safari:
                System.out.println("Safari browser is set");


            case edge:
                System.out.println("Edge browser is set");

        } //no need to default

        System.out.println("===========");

        Day day=Day.Sat;
        Day day1=Day.Tue;
        Day day2=Day.Thu;


        Month month1=Month.Jan;
        Month month2=Month.Feb;
        Month month3=Month.Jun;

        Planet planet1=Planet.Earth;
        Planet planet2=Planet.Mars;
        Planet planet3=Planet.Jupiter;

        Level level1=Level.High;
        Level level2=Level.Medium;
        Level level3=Level.ChuckNorries;




    }


}


