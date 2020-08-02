package day30_CustomMethods;

public class MaxMethod {

    public static void main(String[] args) {

maxNum(10, 10);
    }


    public static void maxNum(int a,int b){


        if(a==b) {System.out.println("equal");
        return; //exit the method
            }

        if(a>b) System.out.println("maximum is " +a);
        else System.out.println("maximum is "+ b);




    }
}
