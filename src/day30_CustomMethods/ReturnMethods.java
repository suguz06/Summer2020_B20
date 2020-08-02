package day30_CustomMethods;


//void ==>> no returns
// return also return a value OR exit method
public class ReturnMethods {

    public static  void sum(int a, int b ){



      int sum=a+b;

        System.out.println(sum);

    }


    public static int sum2(int a, int b){
       int sum= a+b; return sum;
    }

    public static void main(String[] args) {

        sum(10, 20);
       int sum= sum2(10, 20);
        System.out.println(sum);
       // System.out.println(sum(10,20)); gives error not re-usable
        System.out.println(sum2(10,20)*2); //here reusable since return type int
    }

}
