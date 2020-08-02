package Office_Hours.Practice_06_24_2020;

public class switch_quiz {
  /*
        an important note for switch ==>> give compile error
        for long, float, double and boolean variables
        i.e. swicth(double???)==>> not
         */

    public static void main(String[] args) {

      int a=10;
      switch (a) {

          case 10:
              System.out.println("monday");
          case 11:
              System.out.println("tuesday");
          default:
              System.out.println("hello");



      }


    }



}
