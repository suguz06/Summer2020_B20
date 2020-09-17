package Office_Hours.Practice_09_16_2020;

public class ThrowsKeyword {


    public void methodA() throws InterruptedException { //disadvatgates => every time you have to solve

        Thread.sleep(3000);

    }

    public void methodB() throws InterruptedException { //gives compile error
        methodA();
    }

    public static void main(String[] args) throws InterruptedException { // easy way throws keyword to handle checked

        ThrowsKeyword obj= new ThrowsKeyword(); // if you want to use instance method=> you need an object

        obj.methodA(); // solve temproary solution => but easy to implement
//       try {
//        obj.methodA(); }
//       catch (Exception a){
//           System.out.println(a.getMessage());
//       }
//
//        try {
//            obj.methodA(); }
//        catch (InterruptedException a){
//            System.out.println(a.getMessage());
//        }


    }



}
